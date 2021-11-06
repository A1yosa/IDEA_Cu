package 算法语言基础;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("请猜测两个数的和：");
        int n3 = sc.nextInt();
        int sum = n1 + n2;
        if(n3 == sum){
            System.out.println("恭喜你猜对了！");
        }else{
            System.out.println("很遗憾，你猜错了！正确答案是：" + sum);
        }
    }
}

