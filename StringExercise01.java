package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringExercise01 {
    public static void main(String[] args) {
        String a = "jtl";
        String b = new String("jtl");
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//F
        //b.intern()方法返回常量池的地址
        System.out.println(a == b.intern());//T
        System.out.println(b == b.intern());//F
        /*当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（用 equals(Object) 方法确定），
        则返回池中的字符串。否则，将此 String 对象添加到池中，并返回此 String 对象的引用。
        */
    }
}
