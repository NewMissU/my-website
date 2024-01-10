/*
import java.util.Scanner;


class Tree {

    private int info;
    private Tree left = null;
    private Tree right = null;

    public Tree(int info, Tree left, Tree right) {
        this.info = info;
        this.left = left;
        this.right = right;

    }

    public Tree(int info) {

        this(info, null, null);

    }

    public int getInfo() {

        return this.info;
    }

    public void setInfo(int info) {

        this.info = info;
    }

    public Tree getLeft() {

        return this.left;
    }

    public Tree getRight() {

        return this.right;
    }

    public void setLeft(Tree left) {

        this.left = left;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}

class Bst {

    private Tree root;

    public Bst() {
        root = null;
    }

    public Tree getRoot() {
        return root;
    }

    public void insert(int inf) {
        root = insert(root, inf);
    }

    public int getHeight() {
        if (root == null) {
            return -1;
        }

        return height(root);
    }

    public int height(Tree root) {
        if (root == null) {
            return -1;
        }
        int l = height(root.getLeft());
        int r = height(root.getRight());
        return (l >= r ? l : r) + 1;
        //return Math.max(l, r)+1;

    }

    private Tree insert(Tree tree, int inf) {
        if (tree == null) {
            return new Tree(inf);
        }

        if (inf <= tree.getInfo()) {
            tree.setLeft(insert(tree.getLeft(), inf));
        } else if (inf > tree.getInfo()) {
            tree.setRight(insert(tree.getRight(), inf));
        }

        return tree;
    }

   
    public static void printPreOrder(Tree tree) {
        if (tree == null) {
            System.out.print(" - ");
            return;
        }
        System.out.print(" " + tree.getInfo() + " ");
        if (tree.getRight() != null || tree.getLeft() != null) {
            System.out.print("[");
            printPreOrder(tree.getLeft());
            printPreOrder(tree.getRight());
            System.out.print("]");
        }
    }
    
     public String search(int inf) {
        String direct = "";
        //   Tree root= null;
        return search(root, inf, direct);

    }

    private String search(Tree root, int inf, String direct) {

        if (root == null || root.getInfo() == inf) {
            System.out.print(inf + ": ");
            System.out.print("(" + direct + ")");
            if (root == null) {
                System.out.println(" Not Found!");
            } else {
                System.out.println(" Found!");
                return null;
            }
            return direct;
        }

        if (root.getInfo() > inf) {
            if (root.getLeft() != null) {
                direct += "L";

            }
            return search(root.getLeft(), inf, direct);
        } else {
            if (root.getRight() != null) {
                direct += "R";

            }

            return search(root.getRight(), inf, direct);
        }

    }


}

// other methods follow here
public class Tree1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bst bst = new Bst();
        int max = 20;
        int min = 10;
        int range = max - min + 1;
        //int n = (int) ((Math.random() * range) + 10);
        int n = 10;

        System.out.println("--- Random Numbers [" + n + "] ---");
        for (int i = 0; i < n; i++) {
            //int randNum = (int) (Math.random() * 50);
            int randNum = sc.nextInt();
            System.out.print(randNum + " ");
            bst.insert(randNum);
        }

        System.out.println();
        System.out.println("--- Tree (Height=" + bst.getHeight() + ") ---");

        bst.printPreOrder(bst.getRoot());
        System.out.println();
        System.out.println("--- Search ---");

        for (;;) {
            int randTarget = (int) (Math.random() * 50);
            Object checkNum = bst.search(randTarget);

            if (checkNum == null) {
                break;
            }

        }

    }

}
*/