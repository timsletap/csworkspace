package Sets;

import java.util.HashSet;

public class Coin
{
private double value; //.25
private String name;// quarter
public Coin(double val){
    this.value = val;
    if(val == 0.25){name = "Quarter";}
    if(val == 0.10){name = "Dime";}
    if(val == 0.05){name = "Nickel";}
    if(val == 0.01){name = "Penny";}
}

public double getValue(){
    return this.value;
}

public String toString(){
    return this.getName() + ": "+this.getValue();
}
public String getName() {
   return this.name;
}
public int hashCode(){
        int h1 = name.hashCode();
        Double temp = value;
        int h2 = temp.hashCode();
       final int HASH_MULTIPLIER = 31;
       int h = HASH_MULTIPLIER * h1+h2;
        return h;
    }
public boolean equals(Object ot){
    if(ot == null){
        return false;
    }
    if(getClass() != ot.getClass()){
        return false;
    } 
    Coin other = (Coin) ot;
    return value == other.value && name.equals(other.name);
}
public static void main(String[] args) {
Coin coin1 = new Coin(0.25);
Coin coin2 = new Coin(0.25);
Coin coin3 = new Coin(0.05);
Coin coin4 = new Coin(0.10);
Coin coin5 = new Coin(0.01);
Coin coin6 = new Coin(0.25);
HashSet<Coin> purse = new HashSet<Coin>();
double sum = 0;
purse.add(coin1);
purse.add(coin2);
purse.add(coin3);
purse.add(coin4);
purse.add(coin5);
purse.add(coin6);
for (Coin x: purse){System.out.println(x);}
for(Coin x : purse){
sum += x.getValue();
}
System.out.println("Total: " + sum);
System.out.println(purse);
System.out.println(purse.size());
System.out.println(purse.contains(new Coin(.25 )));
System.out.println(purse.contains(coin2));
}
}
