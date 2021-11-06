package 算法语言基础;

import java.util.Scanner;

public class test02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("请输入一个4位正整数：");
        n = sc.nextInt();
        int a,b,c,d;
        a = n/1000;
        b = (n-1000*a)/100;
        c = ((n-1000*a)-100*b)/10;
        d = ((n-1000*a)-100*b)-10*c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

