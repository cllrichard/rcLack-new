package com.example.rclack.leetcode.day2022.day11.day1123;

import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
//          String tepmlatePath = "/Users/xiliheng/Desktop/water/yuanwangTempl.docx";
//
//        ClassPathResource classPathResource = new ClassPathResource("doc/yuanwangTempl.docx");
//
//        String tepmlatePath = ClassPathResource.class.getClassLoader().getResource("doc/yuanwangTempl.docx").getPath();
////        String reportTargetPath = ClassPathResource.class.getClassLoader().getResource("doc/yuanwangTemplTarget.docx").getPath();
//        File file = new File("yuanwangTemplTarget.docx");
//        file.createNewFile();
//        String reportTargetPath = file.getCanonicalPath();
//        //   String reportTargetPath = "/Users/xiliheng/Desktop/water/yuanwang20221114_2.docx";
////        String reportTargetPath = "/Users/caolonglong/JFModel/pc/ies-sep/sep-webapi/src/main/resources/doc/yu12213wqew1q23.docx";
//
////        File file = ResourceUtils.getFile("classpath:doc/yuanwangTempl.docx");
//        Map<String, Object> paramMap = new HashMap<>(16);
//        paramMap.put("beginDate","2022-11-01");
//        paramMap.put("endDate","2022-11-15");
//
//        List<List<TableEntity>> drugTableList = new ArrayList<>();
//
//        int cell1 = 1000;
//        int cell2 = 7000;
//        int cell3 = 1000;
//        int fontSize = 100;
//
//        int tableSerialNum= 1;
//        List<TableEntity> tableTitleList = Arrays.asList(new TableEntity("序号", cell1,fontSize), new TableEntity("药剂", cell2,fontSize), new TableEntity("用量", cell3,fontSize));
//        drugTableList.add(tableTitleList);
//
//        for (int i=0;i<3;i++){
//            List<TableEntity> drugData = Arrays.asList(new TableEntity(String.valueOf(tableSerialNum)+"我是字体", cell1,fontSize), new TableEntity("12", cell2,fontSize), new TableEntity(StringUtilsExt.cutZero(String.valueOf("13")), cell3,fontSize));
//            drugTableList.add(drugData);
//            tableSerialNum++;
//        }
//
//        //如果没有，则穿一个空的List
//        //paramMap.put("tbAddDynTable:tb1",new ArrayList<TableEntity>());
//
//        paramMap.put("tbAddDynTable:tb1", drugTableList);
////        paramMap.put("tbAddDynTable:tb2", new ArrayList<TableEntity>());
//        paramMap.put("tbAddDynTable:tb2", drugTableList);
//        paramMap.put("tbAddDynTable:tb3", drugTableList);
//        paramMap.put("tbAddDynTable:tb4", drugTableList);
//        paramMap.put("tbAddDynTable:tb5", drugTableList);
//
//        DynWordUtils.process(paramMap, tepmlatePath,reportTargetPath);
////        try {
////            planService.getFewDaysOptimizationExport(planVO,response);
////        } catch (Exception e) {
////            log.info("控制计划-日前优化调整-数据 ： " + e.getMessage());
////        }
////        return Result.data(reportTargetPath);
//        File files=new File(reportTargetPath);
//        String filename=file.getName();
//        // 以流的形式下载文件。
//        InputStream fis = new BufferedInputStream(new FileInputStream(reportTargetPath));
//        byte[] buffer = new byte[fis.available()];
//        fis.read(buffer);
//        fis.close();
//        // 清空response
//        response.reset();
//
//        response.setContentType("application/octet-stream;charset=UTF-8");
//        String fileName = new String(filename.getBytes("gb2312"), "iso8859-1");
//        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
//        OutputStream ouputStream = response.getOutputStream();
//        ouputStream.write(buffer);
//        ouputStream.flush();
//        ouputStream.close();
    }
}
