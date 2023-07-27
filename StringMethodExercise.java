package com.jtl.String_;

import java.util.Scanner;

/**
 * @author 蒋天乐
 * java学习用
 */
public class StringMethodExercise {
    public static void main(String[] args) {
        String name = null;
        String password = null;
        String email = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名、密码、邮箱：");
        name = scanner.next();
        password = scanner.next();
        email = scanner.next();
        try {
            StringMethodExercise.userRegister(name, password, email);
            System.out.println("注册成功！！！");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("自动退出界面...");
        }

    }
    public static void userRegister(String name,String pwd,String email){

        if(!(name != null && pwd != null && email != null)){
            throw new RuntimeException("参数不能为空！！！");
        }


        if(!(name.length() >= 2 && name.length() <= 4)){
            throw new RuntimeException("用户名长度必须为2、3、4");
        }
        if(!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码长度必须为6而且必须全为数字！！！");
        }
        //indexOf方法要是找不到就直接返回-1
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > -1 && j > i)){
            throw new RuntimeException("邮箱中包含@和. 而且@在.前面");
        }
    }
    public static boolean isDigital(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < '0' || arr[i] > '9'){//说明不是数字->在0-9之外了
                return false;
            }
        }
        return true;
    }

}
