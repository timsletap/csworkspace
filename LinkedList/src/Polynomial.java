import java.util.ListIterator;
import java.util.LinkedList;
public class Polynomial {
	
	private LinkedList<Term> terms;
	public Polynomial() {
		terms = new LinkedList<Term>();
	}
	
	public String toString() {
		String tempS = "";
		ListIterator<Term> tempX = terms.listIterator();
		if(tempX.hasNext()) {
			tempS += tempX.next();
		}
		while(tempX.hasNext()) {
			tempS += " + " + tempX.next();
		}
		return tempS;
	}
	
	
	public void insertTerm(Term t) {
	    if (terms.size() == 0) {
	        terms.addFirst(t);
	        return;
	    }
	    ListIterator<Term> temp = terms.listIterator();
	    if(terms.getLast().getExpo() > t.getExpo()) {
	    	terms.addLast(t);
	    	return;
	    }
	    if(terms.getFirst().getExpo() < t.getExpo()){
	    	terms.addFirst(t);
	    	return;
	    }
	    while (temp.hasNext()) {
	        Term current = temp.next();
	        if (current.getExpo() < t.getExpo()) {
	            temp.previous();
	            temp.add(t);
	            return;
	        } 
	        if(current.getExpo() == t.getExpo()){
	        	temp.set(Term.add(temp.previous(), t));
	        	return;
	        }
	    }

	    
	   
	}

	
	

	
	public static Polynomial sum(Polynomial p, Polynomial q){
		Polynomial temp = new Polynomial();
		ListIterator<Term> tempX = p.terms.listIterator();
		while(tempX.hasNext()) {
			temp.insertTerm(tempX.next());
		}
		ListIterator<Term> tempY = q.terms.listIterator();
		while(tempY.hasNext()) {
			temp.insertTerm(tempY.next());
		}
	return temp;
	
	}
		
	
	
	public static Polynomial difference(Polynomial p, Polynomial q){
		Polynomial temp = new Polynomial();
		ListIterator<Term> tempX = p.terms.listIterator();
		while(tempX.hasNext()) {
			temp.insertTerm(tempX.next());
		}
		ListIterator<Term> tempY = q.terms.listIterator();
		while(tempY.hasNext()) {
			Term tempOBJ = tempY.next();
			temp.insertTerm(Term.add(tempOBJ, new Term(0-tempOBJ.getCoeff(), tempOBJ.getExpo())));
		}
	return temp;
	}
	
	public static Polynomial product(Polynomial p, Polynomial q){
		Polynomial temp = new Polynomial();
		ListIterator<Term> tempX = p.terms.listIterator();
		
	
		while(tempX.hasNext()) {
			Term objX = tempX.next();
			ListIterator<Term> tempY = q.terms.listIterator();
			while(tempY.hasNext()) {
				Term objY = tempY.next();
				temp.insertTerm(Term.multiply(objY, objX));
				
			}
			
		}
	return temp;
	}
	
	public static Polynomial derivative(Polynomial p) {
	    Polynomial temp = new Polynomial();
	    ListIterator<Term> tempP = p.terms.listIterator();
	    
	    while (tempP.hasNext()) {
	        Term x = tempP.next();
	        if(x.getExpo() != 0) {
	        	
	        int newCoeff = x.getCoeff() * x.getExpo();
	        int newExpo = x.getExpo() - 1;
	        temp.insertTerm(new Term(newCoeff, newExpo));
	        }
	    }
	    
	    return temp;
	}



	
	public static void main(String[] args) {
	Polynomial p = new Polynomial();
	p.insertTerm(new Term(3,4));
	p.insertTerm(new Term(-2, 0));
	p.insertTerm(new Term(1,3));
	p.insertTerm(new Term(2,3));
	System.out.println(p);
	Polynomial s = new Polynomial();
	s.insertTerm(new Term(2,3));
	s.insertTerm(new Term(-3,0));
	s.insertTerm(new Term(1,4));
	System.out.println(s);
	System.out.println(product(s,p));
	System.out.println(derivative(p));
	
}
	}
