import javax.swing.tree.TreeNode;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreNode<E> root;
    protected int size = 0;
    public BST(){
    }
    public BST(E[] object){
        for (E e : object){
            insert(e);
        }
    }
    protected TreNode<E> createNewNode(E e){
        return new TreNode<>(e);
    }

    @Override
    public boolean insert(E e) {
        if (root == null){
            root = createNewNode(e);
        } else {
            TreNode<E> parent = null;
            TreNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }
    @Override
    public int getsize() {
        return size;
    }
    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreNode<E> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.element + " ");
        inOrder(root.right);
    }
}
