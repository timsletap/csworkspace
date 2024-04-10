package Maps.Wrestler;

import java.util.HashSet;

public class TeamSet {
    private HashSet<Wrestler> team;

    public TeamSet(){
        team = new HashSet<Wrestler>();
    }

    public void add(Wrestler w ){
        team.add(w);
    }

    public double avgWeight(){
        double avg = 0;
        for(Wrestler w : team){
            avg += w.getWeight();
        }
        return avg /= team.size();
    }

    public HashSet<Wrestler> lightweights(){
        HashSet<Wrestler> temp = new HashSet<Wrestler>();
        for(Wrestler w : team){
            if(w.getWeight() <= 120){
                temp.add(w);
            }
        }
        return temp;
    }

    public void display() {
        for(Wrestler w : team){
            System.out.println(w);
        }
    }

    public static void main(String[] args){
        System.out.println("Team Set");
        TeamSet one = new TeamSet();
        one.add(new Wrestler("Alok", 130));
        one.add(new Wrestler("Cody", 60));
        one.add(new Wrestler("John", 90));
        one.display();
        System.out.println(one.avgWeight());
        System.out.println(one.lightweights());
        System.out.println();


    }

    

}
