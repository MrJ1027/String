package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringExercise02 {
    public static void main(String[] args) {
        //1.
        String s1 = "jtl";
        s1 = "JTL";
        //创建了2个对象，因为String里面的value是final，不能修改
        //一个字符串对象一旦被分配，其内容是不可改变的，但是指向"jtl"的s1可以变为指向"JTL"

        //2.
        String a = "jtl" + "football";
        //上面的语句编译器会优化 -> String a = "jtlfootball";
        //所以只创建了一个对象

        //3.下面创建了几个对象？
        String a1 = "jtl";
        String b = "football";
        String c = a1 + b;
        //注意我认为和前面没关系，不然就得起好几个名字不方便
        //关键要分析String c = a1 + b;
        //1.先创建一个 StringBuilder sb = new StringBuilder()
        //2.执行 sb.append("jtl") 3.sb.append("football")
        //4.String c = b.toString()
        //最后其实是c指向堆中的对象(String) value[] -> 常量池中"jtlfootball"
        //所以一共有三个对象，验证：
        String d = "jtlfootball";
        System.out.println(c == d);//F 说明了c和d并不是同一个对象，d直接指向常量池的"jtlfootball"
        //而这个c指向堆里面的一个对象，这个对象里面的value才指向常量池里面的"jtlfootball"
        //得出一个重要规则：如果常量相加，看的是常量池；变量相加，看的是堆

    }
}
