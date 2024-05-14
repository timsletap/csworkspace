package Trees;

import java.util.Comparator;

public class NumberComparator implements Comparator<PhoneEntry> {

    public int compare(PhoneEntry p1, PhoneEntry p2){
        return p1.getNum().compareTo(p2.getNum());
    }
    
}
