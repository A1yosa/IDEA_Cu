package 数据结构;

import java.util.Scanner;

public class Treeh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] str = n.split(" ");
        String sqBiTree = "";
        for (String str2:str){
            if (str2.equals("None")){
                sqBiTree += "*";
            }else {
                sqBiTree += str2;
            }
        }
        BiTreeNode root = createBiTree(sqBiTree,0);
        BiTreeNode.isRootTraverse(root);
    }
    public static BiTreeNode createBiTree(String sqBiTree,int index){
        BiTreeNode root = null;
        if (index<sqBiTree.length()){
            root = new BiTreeNode(sqBiTree.charAt(index));
            root.lchild = createBiTree(sqBiTree,2*index+1 );
            root.rchild = createBiTree(sqBiTree, 2*index+2);
        }
        return root;
    }
}
class BiTreeNode{
    public Object data;
    public BiTreeNode lchild,rchild;
    public BiTreeNode(){}

    public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }
    public BiTreeNode(Object data){
        this(data,null,null);
    }
    public static void isRootTraverse(BiTreeNode T){
        if (T != null){
            isRootTraverse(T.lchild);
            if (!String.valueOf(T.data).equals("*")){
                System.out.print(T.data+" ");
            }
            isRootTraverse(T.rchild);
        }
    }

    @Override
    public String toString() {
        return "BiTreeNode{" +
                "data=" + data +
                ", lchild=" + lchild +
                ", rchild=" + rchild +
                '}';
    }
}

