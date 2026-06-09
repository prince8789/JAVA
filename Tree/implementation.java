    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
public class implementation {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(1);
        Node f = new Node(-1);
        Node g = new Node(-3);
        Node h = new Node(6);
        Node i = new Node(3);
        Node j = new Node(4);
        a.left =b; a.right = c;
        b.left = d; b.right = e;
        c.left = f ; c.right =g;
        d.left = h;
        h.left =i;
        g.left =j;
        Display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(labels(a));
        
        
    }
    

    public static void Display(Node root){
        if(root == null) return;
        System.out.print(root.val+"  ");
        Display(root.left);
        Display(root.right);
    }


    public static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }

public static int sum(Node root){
    if(root == null) return 0;
    return root.val + sum(root.left) + sum(root.right);
}

public static int product(Node root){
    if(root == null) return 1;
    return root.val * product(root.left) * product(root.right);
}

public static int max(Node root){
    if(root == null) return Integer.MIN_VALUE;
    return Math.max(root.val,(Math.max(max(root.left),max(root.right))));

    
}

public static int min(Node root){
    if(root == null) return Integer.MAX_VALUE;
    return Math.min(root.val,(Math.min(min(root.left),min(root.right))));

    
}

public static int labels(Node root){
    if(root == null) return 0;
    return 1 + Math.max(labels(root.left),labels(root.right));
}
}
