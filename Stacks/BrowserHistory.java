package Stacks;

// This program simulates a browser history tracker using stacks The program should keep track of //URLs and support the basic navigation operations: goForward() and goBack()
import java.util.Stack;
public class BrowserHistory {
    private Stack<String> back;
    private Stack<String> forward;

    public BrowserHistory() {
        back = new Stack<>();
        forward = new Stack<>();
    }
    //adds the given URL to the browser history.
    public void visitURL(String url) {
         back.push(url);
         forward.clear();

}
    //Simulates clicking the back button in the browser. 
    //It should remove the current URL from the history and return the previous URL. 
    //If there is no previous URL, return "No more history."
    public String goBack() {
         if(!back.isEmpty()){
            forward.push(this.getCurrentURL());
            back.pop();
            if(back.isEmpty()){
                return "No more History";
            } else {
                return back.peek();
            }
         } else{
            return "No More History";
         }
    	}

    //Simulates clicking the forward button in the browser. 
    //It should return the next URL in the history. 
    //If there is no next URL, return "No more history."
    public String goForward() {
		if(forward.isEmpty()){
            return "No More History";
        } 
        String temp = forward.pop();
        back.push(temp);
        return temp; 
     }
    
    //returns the current URL without modifying the history.
    public String getCurrentURL() {
    	  if (back.isEmpty()) 
    		  return "No current URL."; 
    	  else
    		  return back.peek();
    }
//Sample driver with outputs
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitURL("https://www.one.com");
        browserHistory.visitURL("https://www.two.com");
        browserHistory.visitURL("https://www.three.com");
        System.out.println("Current URL: " + browserHistory.getCurrentURL()); 
//Current URL: https://www.three.com
        System.out.println("Go back: " + browserHistory.goBack()); 
//Go back: https://www.two.com
        System.out.println("Go back: " + browserHistory.goBack()); 
//Go back: https://www.one.com
        System.out.println("Go back: " + browserHistory.goBack()); 
//Go back: No more history.
        System.out.println("Go forward: " + browserHistory.goForward()); 
//Go forward: https://www.one.com
        System.out.println("Go forward: " + browserHistory.goForward()); 
//Go forward: https://www.two.com
        System.out.println("Go forward: " + browserHistory.goForward()); 
//Go forward: https://www.three.com
        System.out.println("Go forward: " + browserHistory.goForward()); 
//Go forward: No more history.
        browserHistory.visitURL("https://www.four.com");
        System.out.println("Go forward: " + browserHistory.goForward()); 
//Go forward: No more history.
        System.out.println("Go back: " + browserHistory.goBack()); 
//Go back: https://www.three.com
    }}