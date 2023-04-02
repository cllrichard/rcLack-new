package com.example.rclack.demo.excel;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @program:
 * @description: 将excel文件转为user对象
 * @create: 2019-02-26 10:44
 **/
@Slf4j
public class POISupport {

    private static String columns[] = { ExcelUtilConstant.DATA_NAME,ExcelUtilConstant.DATA_AGE,ExcelUtilConstant.DATA,ExcelUtilConstant.DATA_TYPE};

    public static List<Map<String, Object>> readExcel(InputStream inputStream) throws ParseException, IOException {
        Workbook wb = new XSSFWorkbook(inputStream);;
        Sheet sheet;
        //用来存放表中数据
        List<Map<String, Object>> list = new ArrayList<>();
        Object cellData;
        if (wb != null) {
            //获取第一个sheet
            sheet = wb.getSheetAt(0);
            //获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            //获取第一行
            Row row;
            for (int i = 1; i < rownum; i++) {
                Map<String, Object> map = new LinkedHashMap<String, Object>();
                row = sheet.getRow(i);
                if (row != null) {
                    for (int j = 0; j < columns.length; j++) {
                        //cell.getCellType() != CellType.BLANK 判断字段是否为空，根据需求而加
                        if (row.getCell(j) != null && !row.getCell(j).equals("")) {
                            cellData = formatValueType(columns[j], row.getCell(j));
                            map.put(columns[j], cellData);
                        }
                    }
                    if (!map.isEmpty()) {
                        list.add(map);
                    }
                } else {
                    continue;
                }
            }
        }
        return list;
    }

    //转换单元格类型为java类型
    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null || cell.getCellType() != CellType.BLANK) {
            //判断cell类型
            if(cell.getCellType() == CellType.NUMERIC){
                if (DateUtil.isCellDateFormatted(cell)) {
                    //转换为日期格式YYYY-mm-dd
                    SimpleDateFormat sdf = new SimpleDateFormat(ExcelUtilConstant.DATE_FORMAT);
                    cellValue = sdf.format(cell.getDateCellValue());
                } else {
                    //数字
                    cellValue = (int) cell.getNumericCellValue();
                }
            } else if(cell.getCellType() ==  CellType.FORMULA ){
                //数字
                cellValue = String.valueOf(cell.getNumericCellValue());
            } else if(cell.getCellType() == CellType.STRING){
                cellValue = cell.getRichStringCellValue().getString();
            }
        } else {
            cellValue = "";
        }
        return cellValue;
    }

    //根据业务对象属性类型转换单元格值数据类型
    public static Object formatValueType(String columnName, Cell cell) throws ParseException {
        Object cellData;
        cellData = getCellFormatValue(cell);
        return cellData;
    }
}
