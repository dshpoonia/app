package ds.tree;

import ds.tree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dpooni on 3/16/2017.
 */
public class BST<T> {
    private Node<T> root;

    public BST(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void traverseLevelOrder(Node n){
        System.out.println(n.getData());
        displayLevelOrder(Arrays.asList(n.getLeft(), n.getRight()));
    }

    private void displayLevelOrder(List<Node> nodes) {
        List<Node> toDisplay = new ArrayList<Node>();
        for(Node n : nodes){
            if(n != null){
                System.out.println(n.getData());
                toDisplay.add(n.getLeft());
                toDisplay.add(n.getRight());
            }
        }

        if(!toDisplay.isEmpty()){
            displayLevelOrder(toDisplay);
        }
    }

    public void traverseInorder(Node n){

        if(n == null){
            return;
        }

        traverseInorder(n.getLeft());
        System.out.println(n.getData());
        traverseInorder(n.getRight());
    }

    public void traversePostOrder(Node n){
        if(n == null){
            return;
        }

        traversePostOrder(n.getLeft());
        traversePostOrder(n.getRight());
        System.out.println(n.getData());
    }

    public void traversePreOrder(Node n){
        if(n == null){
            return;
        }

        System.out.println(n.getData());
        traversePreOrder(n.getLeft());
        traversePreOrder(n.getRight());
    }

    public int getSize(Node n ){
        if(n == null){
            return 0;
        }

        return getSize(n.getLeft()) + 1 + getSize(n.getRight());
    }
}
