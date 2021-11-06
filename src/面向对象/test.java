package 面向对象;

//打印99乘法表
public class test {
    public static void main(String[] args)
    {
        int i, j;
        for (i = 1; i < 10; i++)
        {              //控制行
            for ( j = 1; j <= i; j++)            //控制列
                System.out.print(i + "×" + j + "=" + (i * j) +"  ");
            System.out.println();
        }
    }
}



