package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {

        String str = null;//ok
        StringBuffer sb = new StringBuffer();//ok
        //下面这句看源码：
        /*
            public AbstractStringBuilder append(String str) {
                if (str == null)
                    return appendNull();
                int len = str.length();
                ensureCapacityInternal(count + len);
                str.getChars(0, len, value, count);
                count += len;
                return this;
            }
            底层调用的是 AbstractStringBuilder的append,然后因为为null，又去调用appendNull：
             private AbstractStringBuilder appendNull() {
                int c = count;
                ensureCapacityInternal(c + 4);
                final char[] value = this.value;
                value[c++] = 'n';
                value[c++] = 'u';
                value[c++] = 'l';
                value[c++] = 'l';
                count = c;
                return this;
            }
        * */
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        //下面的构造器，会抛出NullpointerException异常：
        /*
        *     public StringBuffer(String str) {
                super(str.length() + 16);
                append(str);
               }
        * */
        StringBuffer sb1 = new StringBuffer(str);//str为null，然后null.length() --> 空指针异常
        System.out.println(sb1);
    }
}
