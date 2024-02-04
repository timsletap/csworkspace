package Stacks;

import java.util.Stack;

import java.util.*;
public class CDStack {

    Stack<String> myStack;
   public CDStack()
   {
        myStack = new Stack<String>();   
        myStack.push("Rumours");
        myStack.push("Joshua Tree");
        myStack.push("Abbey Road");
        myStack.push("Muse Greatest Hits");
        myStack.push("Born To Run");
        myStack.push("Revolver");
        myStack.push("Peter Frampton Comes Alive");
        myStack.push("Space Oddity");
        myStack.push("Tommy");
        myStack.push("White Album");
        System.out.println(myStack.get(0));
       
   }
   public String nextCD(){
    return myStack.peek();
   }

   public void addCD(String x){
    myStack.push(x);
   }

   public void removeCD(){
    myStack.pop();
   }
   public void playAllCDs(){
    while(!(myStack.empty())){
        System.out.print(myStack.pop() + " ");
    }
   }
   public void printCDs2(){
    Iterator<String> i = myStack.iterator();
    while(i.hasNext()){
        System.out.print(i.next() + " ");
    }
  }
   public void printCDs3() {
        for(String x : myStack){
            System.out.print(x + " ");
        }
    }

}



   