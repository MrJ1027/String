package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 * 判断一个字符串有多少大写、小写字母和数字
 */
public class StringMethodCharacter {
    public static void main(String[] args) {
        f1("jjj555JJJ");

    }
    public static void f1(String str){
        int countOfSmall = 0;
        int countOfBig = 0;
        int countOfNumber = 0;
        if(str == null){
            System.out.println("传入字符串为空！！！");
            return;
        }
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] > 'a' && chars[i] < 'z'){
//                countOfSmall++;
//            }else if(chars[i] > 'A' && chars[i] < 'Z'){
//                countOfBig++;
//            }else if(chars[i] > '0' && chars[i] < '9'){
//                countOfNumber++;
//            }
//        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > 'a' && str.charAt(i) < 'z'){
               countOfSmall++;
           }else if(str.charAt(i) > 'A' && str.charAt(i) < 'Z'){
                countOfBig++;
           }else if(str.charAt(i) > '0' && str.charAt(i) < '9'){
               countOfNumber++;
            }

        }
        System.out.println("小写字母\t大写字母\t数字\n" + countOfSmall +"\t\t"+ countOfBig + "\t\t"+ countOfNumber );
    }
}
