package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 * String 和 StringBuffer的相互转化
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String --> StringBuffer
        String str = "jtl";
        //方式一 使用构造器
        //返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式二 使用append方法追加
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer --> String
        StringBuffer stringBuffer2 = new StringBuffer("football");
        //方式一 使用StringBuffer提供的toString()方法
        String str2 = stringBuffer2.toString();
        //方式二 使用构造器直接转化
        String s = new String(stringBuffer2);

        System.out.println(stringBuffer2);


    }
}
