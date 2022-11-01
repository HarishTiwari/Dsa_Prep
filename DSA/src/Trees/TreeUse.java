package Trees;

import java.util.Scanner;

public class TreeUse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);
        print(root);

//        TreeNode<Integer> root = new TreeNode<Integer>(4);
//        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//        TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//
//        System.out.println(root);
    }

    private static void print(TreeNode<Integer> root){
        String s = root.data + ":";

        for(int i = 0 ; i < root.children.size() ; i++){
            s = s + root.children.get(i).data + ",";
        }

        System.out.println(s);
        for(int i = 0 ; i < root.children.size() ; i++){
            print(root.children.get(i));
        }

    }

    private static TreeNode<Integer> takeInput(Scanner sc) {
        int n;
        System.out.println("Enter next node data ");
        n = sc.nextInt();



        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for " + n);
        int childCount = sc.nextInt();

        for (int i = 0; i < childCount; i++) {

            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }

        return root;
    }
}
