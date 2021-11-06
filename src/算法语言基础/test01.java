package 算法语言基础;

import java.util.Scanner;

public class test01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float xs;
        System.out.print("请输入一个小数：");
        xs = sc.nextFloat();
        System.out.println("与该数最接近的整数为：" + Math.round(xs));
    }
}

