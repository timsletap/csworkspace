package Stacks;
public class ArrayStack implements MyStack{
    
    Object[] temp;
    
    public ArrayStack(){
        temp = new Object[0];
    }

    @Override
    public Object push(Object item) {
        Object[] tempArr = temp;
        temp = new Object[temp.length+1];
        temp[0] = item;
       for(int i = 0; i < tempArr.length;i++){
        temp[i+1] = tempArr[i];
       }
        return item;
    }

    @Override
    public Object pop() {
        Object[] tempArr = temp;
        temp = new Object[temp.length-1];
        Object item = tempArr[0];
       for(int i = 1; i < tempArr.length;i++){
        temp[i-1] = tempArr[i];
       }
        return item;
    }
    

    @Override
    public Object peek() {
        return temp[0];
    }

    @Override
    public boolean isEmpty() {
       return temp.length == 0;
    }

    @Override
    public int size() {
        return temp.length;
    }

    @Override
    public int search(Object a) {
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == a){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Searching for 2: Index " + stack.search(2));

        System.out.println("Popping: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }



}