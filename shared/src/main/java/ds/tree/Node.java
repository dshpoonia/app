package ds.tree;

/**
 * Created by dpooni on 3/16/2017.
 */
public class Node<T> {
    private Node<T> left, right;
    private T data;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public T getData() {
        return data;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void setData(T data) {
        this.data = data;
    }
}
