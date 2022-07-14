package less_6;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.NoSuchElementException;

public class Tree<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        int size;
        int height;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.size = 1;
            this.height = 0;
        }
    }

    public int size() {
        return size(root);
    }
    
    public int height(){
        return  height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("нул не должен быть");
        }
        return true;
    }

    public final boolean contains(Key key) {
        return get(key) != null;
    }

    public final Value get(Key key) {
        isKeyNotNull(key);
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.value;
        } else if (cmp < 0) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    public final void add(Key key, Value value) {
        isKeyNotNull(key);
        if (value == null) {
            throw new IllegalArgumentException("нул не должен быть");
        }
        root = add(root, key, value);
    }

    private Node add(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        } else if (cmp < 0) {
            node.left = add(node.left, key, value);
        } else {
            node.right = add(node.right, key, value);
        }
        node.size = size(node.left) + size(node.right) + 1;
        node.height = height(node.left) + height(node.right) + 1;
        return node;
    }

    public Key minKey() {
        return min(root).key;
    }

    public Key maxKey() {
        return max(root).key;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    private Node max(Node node) {
        if (node.right == null) {
            return node;
        }
        return max(node.right);
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMin(root);
    }

    public void deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMax(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = size(node.left) + size(node.right) + 1;
        node.height = height(node.left) + height(node.right) + 1;
        return node;
    }

    private Node deleteMax(Node node) {
        if (node.right == null) {
            return node.left;
        }
        node.right = deleteMin(node.right);
        node.size = size(node.left) + size(node.right) + 1;
        node.height = height(node.left) + height(node.right) + 1;
        return node;
    }

    public final void delete(Key key) {
        isKeyNotNull(key);
        root = delete(root, key);
    }

    private Node delete(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        }else {
            if (node.left == null){
                return  node.right;
            }
            if (node.right == null){
                return  node.left;
            }
            Node tmp = node;

            node = min(node.right);
            node.right = deleteMin(tmp.right);
            node.left = tmp.left;
        }
        node.size = size(node.left) + size(node.right) + 1;
        node.height = height(node.left) + height(node.right) + 1;
        return node;
    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        } else {
            int lh = root.left.height;
            int rh = root.right.height;
            if (lh - rh > 1 || rh - lh > 1) {
                return false;
            }
        }
        return true;
    }
}
