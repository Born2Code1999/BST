//Code inspired from geeksbygeeks.com
class BinarySearchTree {

//    /* Class containing left and right child of current node and key value*/
//    class Node {
//        String key;
//        Node left, right;
//
//        public Node(String item) {
//            key = item;
//            left = right = null;
//        }
//    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(String key) {
        root = insertRec(root, key);
    }
    // A utility function to search a given key in BST
    public Node search(Node root, String key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key.compareTo(key)==0)
            return root;

        // val is greater than root's key
        if (root.key.compareTo(key) > 0)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, String key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key)<0)
            root.left = insertRec(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        
        tree.insert("55_Black");
        tree.insert("20_Red");


        // print inorder traversal of the BST
        tree.inorder();
    }
}
