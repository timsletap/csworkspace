package Trees;

public class BalancedTree {

    public static TreeNode<Integer> balance(int arr[]){
        return balance(arr, 0, arr.length-1);
    }

    private static TreeNode<Integer> balance(int[] arr, int start, int end){
        if(start > end) return null;
        int mid = (start + end) / 2;
        TreeNode<Integer> node = new TreeNode<Integer>(arr[mid]);
        node.setLeft(balance(arr, start, mid-1));
        node.setRight(balance(arr,mid+1, end));
        return node;
    }

    public static void printLevels(TreeNode<Integer> root, int h){
        if(root == null){
            System.out.println("");
            return;
        } if(h==1) System.out.print(root.getValue() + " ");
            else{ 
                printLevels(root.getLeft(), h-1);
                printLevels(root.getRight(), h-1);
            }
        
    }

    public static void main(String[] args){

    }
    
}
