package 数据结构;

import java.util.Scanner;
public class test4_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit=sc.nextInt();
        int[] arr=new int[digit];
        for(int i=0;i<digit;i++){
            arr[i]= sc.nextInt();
            if(arr[i]==0){
                int j=arr[i];
                for(int n=i;n>0;n--){
                    arr[n]=arr[n-1];
                }
                arr[0]=j;
            }
        }
        for(int j=0;j<digit;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

