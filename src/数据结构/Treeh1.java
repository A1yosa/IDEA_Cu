package 数据结构;

import java.util.Scanner;

public class Treeh1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] str = n.split(" ");
        int numcount = 0;
        int nonecount = 0;
        for (String s:str){
            if(s.equals("None")){
                nonecount++;
            }else {
                numcount++;
            }
        }
        if(numcount - nonecount == 1){
            System.out.println(numcount);
        }else {
            int count = 0;
            for (String s:str){
                if (s.equals("None")){
                    break;
                }else {
                    count++;
                }
            }
            int h = (int) (Math.log(count)/Math.log(2)) + 1;
            if(nonecount == 0){
                int sum = 1;
                for (int i = 0;i < h; i++){
                    sum *= 2;
                }
                System.out.println(numcount<sum?h-1:h);
            }else {
                System.out.println(h);
            }
        }
    }
}
