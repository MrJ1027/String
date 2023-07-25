package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class String02 {
    public static void main(String[] args) {
        //创建String的两种方式：
        //1.直接赋值，先找方法区的常量池里面有没有
        //如果有就直接指向，如果没有的话就在常量池里面创建
        String s = "jtl";
        //2.new的话就先在堆里创建空间，里面有value数组
        //value指向常量池的数据空间，如果没有的话就直接创建
        String s1 = new String("jtl");
        String s3 = "jtl";
        System.out.println(s.equals(s1));//true —> String的equals被重写了，比较的是字符串内容是否相同
        System.out.println(s == s1);//false -> 一个是指向常量池"jtl"的地址，一个是在堆中开辟对象空间的地址，肯定不一样
        System.out.println(s == s3);//true -> 创建s的同时在常量池生成"jtl",然后s3去常量池找，找到了并直接指向"jtl"

        /*小结：
        * 方式一：先从常量池查看是否有"jtl"数据空间，如果有，直接指向;如果没有则重新创建，然后指向。
        * s最终指向的是常量池的空间地址。
        * 方式二：先在堆中创建空间，里面维护了value属性，指向常量池的"jtl"空间，如果常量池没有"jtl"，
        * 重新创建，如果有，则直接通过value指向，最终指向的是堆中的地址空间。
        * */

    }
}
