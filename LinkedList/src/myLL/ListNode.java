
package myLL;
/**
 * Write a description of class ListNode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListNode
{
    // instance variables - replace the example below with your own
    private Object value;
    private ListNode next;

    public ListNode(Object initValue, ListNode initNext)
    {
        value= initValue;
        next = initNext; 
    }

    public Object getValue()
    { 
        return value;
    }
    
    public ListNode getNext()
    {
        return next;
    }
    
    public void setValue( Object theNewValue)
    {
        value=theNewValue;
    }
    
    public void setNext( ListNode theNewNext)
    {
       next=theNewNext;
    } 
        
    public String toString()
    {
    	return value + " ";
    } 
    
    public String toString2()
    {
    	return "" + value + " " + next;
    }


    
}