package 数据结构;

import java.util.Scanner;
import java.util.Stack;

public class HomeWork31 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Stack stack =new Stack();
        int state = 0;
        while (state != -1){
            state = sc.nextInt();
            try {
                if(state == 1){
                    stack.push(sc.nextInt());
                }else if (state == 0){
                    System.out.print(stack.pop()+" ");
                }
            }catch (Exception e){
                System.out.print("error"+" ");
            }
        }
    }
}
