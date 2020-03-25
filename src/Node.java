/* Class containing left and right child of current node and key value*/
class Node {
    String key;
    Node left, right;

    public Node(String item) {
        key = item;
        left = right = null;
    }
}
