import java.util.LinkedList;
import java.util.ListIterator;

public class TransplantQueue<E> implements PriorityQueue<Patient> {

private LinkedList<Patient> temp;

public TransplantQueue(){
    this.temp = new LinkedList<Patient>();
}
public boolean isEmpty() {
   return this.size() == 0;
}

@Override
public void offer(Patient x) {
    if(temp.isEmpty()){
        temp.add(x);
    }
    if(x.getPriority() < temp.getFirst().getPriority()){
        temp.add(x);
    } else {
    ListIterator<Patient> iter = temp.listIterator();
    while(iter.hasNext()){
        if( x.getPriority() > iter.next().getPriority()){
            iter.previous();
            iter.add(x);
            break;
        }
    }
    
    }
   
    
   }


@Override
public Patient poll() {
     ListIterator<Patient> iter = temp.listIterator();
     int least = temp.getFirst().getPriority();
     while(iter.hasNext()){
        int num = iter.next().getPriority();
        if(num < least){
           least = num;
        }
    }
    iter = temp.listIterator();
   while(iter.hasNext()){
    Patient p = iter.next();
        if(p.getPriority() == least){
            iter.remove();
            return p;
        }
    }
    return null;
}

@Override
public Patient peek() {
     ListIterator<Patient> iter = temp.listIterator();
     int least = temp.getFirst().getPriority();
     while(iter.hasNext()){
        int num = iter.next().getPriority();
        if(num < least){
            least = num;
        }
    }
    iter = temp.listIterator();
   while(iter.hasNext()){
    Patient p = iter.next();
        if(p.getPriority() == least){
            return p;
        }
    }
return null;
   
}

@Override
public int size() {
    return temp.size();
}

public String toString(){
    return temp.toString();
}


public static void main(String[] args) {
	TransplantQueue<Patient> pq = new TransplantQueue<Patient>();
	pq.offer(new Patient("Smith", 3));
	pq.offer(new Patient("Cheng", 2));
	pq.offer(new Patient("Jones", 3));
	pq.offer(new Patient("Wong", 3));
	pq.offer(new Patient("Gupta", 2));
	pq.offer(new Patient("Garcia", 1));
	pq.offer(new Patient("Brown", 3));
	System.out.println("The list is");
	System.out.println(pq);
	while (pq.size() > 0) {
		System.out.println("The next patient for the liver transplant is");
			System.out.println(pq.poll());
		}


	}
}
