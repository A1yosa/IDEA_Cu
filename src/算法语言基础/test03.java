package 算法语言基础;

import javax.swing.*;

public class test03 {
    public static void main(String args[]){
        String f = JOptionPane.showInputDialog("请输入一个浮点数！");
        double x = Double.parseDouble(f);
        int m = (int)x;
        float y = (float) (x - m);
        System.out.println("整数部分："+m);
        System.out.println("小数部分："+y);
        System.exit(0);
    }
}
