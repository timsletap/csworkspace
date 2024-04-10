package Maps.Wrestler;

import Sets.Item;

public class Wrestler implements Comparable<Wrestler>{
private int weight;
private String name;
public Wrestler( String theName, int theWeight)
{
name= theName;
weight=theWeight;
}
public int getWeight()
{
return weight;
}
public String getName()
{
return name;
}
public String toString()
{
return name + " " + weight;
}

@Override
public int compareTo(Wrestler o) {
    if (this.weight < o.weight) return -1;
    if (this.weight > o.weight) return 1;
    return 0;
}

public int hashCode(){
    return (weight * 31) * name.length();
}
public boolean equals(Object ot){
            if(ot == null){
                return false;
            }
            if(getClass() != ot.getClass()){
                return false;
            } 
            Wrestler other = (Wrestler) ot;
            return this.getWeight() == other.getWeight() && this.getName().equals(other.getName());
        }
}
