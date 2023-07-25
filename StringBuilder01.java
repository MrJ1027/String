package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        /*
            1.StringBuilder继承 AbstractStringBuilder类
            2.实现了Serializable,说明StringBuilder对象是可以串行化(对象可以网络传输，可以保存到文件)
            3.StringBuilder是final类，不能被继承
            4.StringBuilder的字符序列仍然存放在其父类的 char[] value
            因此，字符序列是在堆中
            5.StringBuilder的方法没有互斥的处理，没有synchronized关键字，一般情况下在单线程使用
        * */
        StringBuilder stringBuilder = new StringBuilder();
    }
}
