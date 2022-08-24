package com.example.rclack.model.day1116;


//-Xss145k
//StackOverflowError
//栈内存溢出
public class JavaVMStackSOF {

    private static int stackLength = 1;

//    public void stackLeak() {
//        stackLength++;
//        stackLeak();
//    }

    public static void stackLeak() {
        long u1,u2,u3,u4,u5;
        stackLeak();
        u1 = u2 = u3 = u4 = u5 = 0;
    }

    public static void main(String[] args) {
//        JavaVMStackSOF oom = new JavaVMStackSOF();
//        try {
//            oom.stackLeak();
//        } catch (Throwable throwable) {
//            System.out.println("stack length:" + oom.stackLength);
//            throw throwable;
//        }
        try {
            stackLeak();
        } catch (Throwable throwable) {
            System.out.println("stack length:" + stackLength);
            throw throwable;
        }
    }
}
