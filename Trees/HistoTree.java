package Trees;
public class HistoTree
{
   private HistoNode root;
   

    public HistoTree( )
    {
        root = null;
    }

    public void addData(Comparable data) {
        if (search(data) == null) {
            root = add(data, root);
        } else {
            HistoNode found = search(data);
            found.setDataCount(found.getDataCount() + 1);  
        }
    }

        

    private HistoNode add(Comparable data, HistoNode tree) {
        if (tree == null) {
            return new HistoNode(data, 1, null, null);
        }
        int dirTest = data.compareTo(tree.getData());
        if (dirTest < 0) {
            tree.setLeft(add(data, tree.getLeft()));
        } else if (dirTest > 0) {
            tree.setRight(add(data, tree.getRight()));
        }
        return tree;
    }


    public HistoNode search(Comparable data)
    {
        return search(data,root);
    }

    private HistoNode search(Comparable data, HistoNode tree) {
        if(tree == null){
            return null;
        } 
        if(data.compareTo(tree.getData()) != 0){
            if(data.compareTo(tree.getData()) < 0){
                return search(data, tree.getLeft());
            } else {
                return search(data, tree.getRight());
            }
        }
        return tree;
    }

    public String toString() {
        return toString(root);
    }

    private String toString(HistoNode tree) {
        if (tree == null) {
            return "";
        }
        return toString(tree.getLeft()) + tree.getData() + " (" + tree.getDataCount() + ") " + toString(tree.getRight());
    }


    public static void main(String[] args) {
        HistoTree tree = new HistoTree();
        tree.addData("apple");
        tree.addData("banana");
        tree.addData("apple");
        tree.addData("orange");
        tree.addData("banana");
        tree.addData("apple");

        System.out.println(tree);
       
    }
}