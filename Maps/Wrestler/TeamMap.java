package Maps.Wrestler;

import java.util.HashMap;

public class TeamMap {
   HashMap<Wrestler,Integer> team;

   public TeamMap(){
    team = new HashMap<Wrestler, Integer>();
    
   }

public void add(Wrestler w){
    int wc = 0;
    for(int i = 110; i <= 200; i += 10){
        if(w.getWeight() < i){
            team.put(w, wc);
            return;
        }
       wc++;

    }
}

public int get(Wrestler w) {
    for(int i = 0; i < team.size(); i++){
        if(team.containsKey(w)){
            return team.get(w);
        }
    }
    return 0;
}

public boolean changeWeightGroup(Wrestler w, int weightClass){
    for(int i = 0; i < team.size(); i++){
        if(team.containsKey(w)){
            team.put(w, weightClass);
            return true;
        }
    }
    return false;
    
}

public String toString(){
    String s = "";
    for(Wrestler x : team.keySet()){
        s += x + ": " + this.get(x) + "\n";
    }
    return s;
}


    public static void main(String[] args){
        System.out.println("Team Map");
    TeamMap a = new TeamMap();
    a.add(new Wrestler("Bob", 157));
    a.add(new Wrestler("Fred", 129));
    a.add(new Wrestler("Jake", 100));
    a.add(new Wrestler("Arnold", 199));
    a.add(new Wrestler("Stan", 120));
    Wrestler juan = new Wrestler("Juan", 180);
    a.add(juan);
    System.out.println(a);
    a.changeWeightGroup(juan, 10);
    System.out.println("Juan is in Weight Group " + a.get(juan));
    System.out.println();
    System.out.println(a);
}

    

    


}



