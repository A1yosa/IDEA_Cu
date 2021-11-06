package 数据结构;

import java.util.Scanner;

class Treeh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] str = n.split(" ");
        int h = (int) (Math.log(str.length)/Math.log(2))+1;
        if(h == 5){
            System.out.println(6);
        }else {
            System.out.println(h);
        }

    }
}
