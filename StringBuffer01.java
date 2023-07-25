package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        * 1.StringBuffer的直接父类是AbstractStringBuilder
        * 2.StringBuffer实现了Serializable接口,其对象可以串行化
        * 3.在父类中，AbstractStringBuilder有属性char[] value,不是final
        *   该value存放字符串内容，引用存放在堆中
        * 4.StringBuffer是final类，不能被继承
        * 5.因为StringBuffer字符内容存在 char[] value，所以在变化(增加/删除字符)
        *   不用每次都更换地址(即不是每次创建新的对象),效率较String高
        * */
        StringBuffer jtl = new StringBuffer("jtl");

        //构造器使用：
        //1.创建一个大小为 16 的char[]，用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();
        //2.通过构造器指定char[]大小
        /*
        *    public StringBuffer(int capacity) {
                super(capacity);
             }*/
        StringBuffer stringBuffer1 = new StringBuffer(32);

        //3.通过给一个String创建StringBuffer(value的长度为字符串长度+16)
        /*  public StringBuffer(String str) {
                super(str.length() + 16);
                append(str);
            }
        * */
        StringBuffer jtl1 = new StringBuffer("jtl");


    }
}
