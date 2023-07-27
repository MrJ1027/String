package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 * 按照规定格式输出名字
 * jiang tian le
 * 返回： le,jiang .T
 */
public class StringFormatExercise {
    public static void main(String[] args) {
        printName("jiang tian");

    }
    public static void printName(String name){
        if(name == null){
            System.out.println("str不能为空");
            return;
        }
        String[] s = name.split(" ");//根据" "去分割...
        if(s.length != 3){
            System.out.println("输入名字格式不正确！！！");
            return;
        }
        String str = String.format("%s,%s .%c",s[2],s[0],s[1].toUpperCase().charAt(0));
        System.out.println(str);


    }
}
