package com.jtl.String_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "实况足球良心游戏一万金币无动画";
        String str2 = null;
        System.out.println(str);
        try {
            str2 = StringReverse.reverse(str, -1, str.length() - 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("after reverse");
        System.out.println(str2);
    }
    public static String reverse(String str,int start,int end){
        //对输入参数进行验证 -> 健壮性！！！
        //1.写出正确情况
        //2.然后取反即可 -> 不正确情况 -> 然后手动抛出异常
        if(!(str != null && start >= 0 && end > start && end < str.length())){
            throw new RuntimeException("参数不合理，请检查！！！");

        }

        //String -> char[] 数组
        char[] arr = str.toCharArray();
        char ch = ' ';
        while(start < end){
            ch = arr[start];
            arr[start] = arr[end];
            arr[end] = ch;
            start++;
            end--;
        }

//        for(int i = start, j = end; i < j; i++, j--){
//
//        }
        //char[] -> String
        return String.valueOf(arr);
        //return new String(arr);
    }
}
