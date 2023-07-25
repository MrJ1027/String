package com.jtl.String_;

import java.util.Scanner;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称：");
        String name = scanner.next();
        System.out.println("请输入商品价格：");
        String price = scanner.next();
        //完成123,456,79,23这种实现
        //先找到小数点的索引，然后在该位置的前三位插入,即可
        //要把String转成StringBuffer才行
        StringBuffer stringBuffer = new StringBuffer(price);
        for(int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer = stringBuffer.insert(i, ",");
        }
        System.out.println(stringBuffer);
    }
}
