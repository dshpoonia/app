package ds.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by dpooni on 3/16/2017.
 */
public class BSTTest {
    @Test
    void traverseInorder() {

        Node<Integer> root = new Node<>(3);
        Node<Integer> left = new Node<>(4);
        Node<Integer> right = new Node<>(5);

        root.setLeft(left);
        root.setRight(right);

        BST<Integer> tree = new BST<>(root);

        tree.traverseInorder(root);

    }

    @Test
    void traversePostOrder() {


        Node<Integer> root = new Node<>(3);
        Node<Integer> left = new Node<>(4);
        Node<Integer> right = new Node<>(5);

        root.setLeft(left);
        root.setRight(right);

        BST<Integer> tree = new BST<>(root);

        tree.traversePostOrder(root);
    }

    @Test
    void traversePreOrder() {

        Node<Integer> root = new Node<>(3);
        Node<Integer> left = new Node<>(4);
        Node<Integer> right = new Node<>(5);

        root.setLeft(left);
        root.setRight(right);

        BST<Integer> tree = new BST<>(root);

        tree.traversePreOrder(root);
    }

    @Test
    void traverseLevelOrder() {

        Node<Integer> root = new Node<>(1);
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(new Node<>(4));
        left.setRight(new Node<>(5));

        BST<Integer> tree = new BST<>(root);

        tree.traverseLevelOrder(root);
    }

    @Test
    void getSize() {

        Node<Integer> root = new Node<>(1);
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(new Node<>(4));
        left.setRight(new Node<>(5));

        BST<Integer> tree = new BST<>(root);

        int result = tree.getSize(root);
        assertEquals(5, result);
    }


}