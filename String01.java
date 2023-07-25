package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class String01 {
    public static void main(String[] args) {
        /*
        * 1.String 对象用于保存字符串，也就是一组字符序列："jtl";
        * 2."jtl" 字符串常量，双引号引起的字符序列
        * 3.字符串的字符使用Unicode字符编码，一个字符占两个字节
        * 4.String类有很多构造器（重载）
        * 5.String 类实现了接口 Serializable 可以串行化：可以在网络传输
        * 还实现了 Comparable 意味着String还可以比较大小
        * 6.String 类是final类，不能被其他类继承
        * 7.String 有属性 private final char value[];
        * 用于存放字符串内容
        * 8.注意：value是final类型，不可以修改(即value不能指向
        * 新的地址，但是其中的字符值是可以改变的：
        * */
        final char[] value = {'a','b','c'};
        value[0] = 'd';//完全OK
        char[] temp = {'x','y','z'};
        //value = temp; 报错：Cannot assign a value to final variable 'value'
        //证明了final类型的value数组不能再改变指向。
    }
}
