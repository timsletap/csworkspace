package Sets;

import java.util.HashSet;

public class cpClub {
    private HashSet<Student> club;

    public cpClub(){
        club = new HashSet<Student>();

    }

    public HashSet<Student> getClub(){
        return club;
    }

    public static void main(String[] args) 
      {
         cpClub conn = new cpClub() ; 
         cpClub miller = new cpClub();
         conn.join(new Student("Aarons", 12345));
         conn.join(new Student("Daley", 3575));
         conn.join(new Student("Chen", 4356));
         miller.join(new Student("Davis", 4345));
         miller.join(new Student("Gupta", 12675));
         miller.join(new Student("Aarons", 12345));
         miller.join(new Student("Yu", 2345));
         miller.join(new Student("Daley", 3579));
         miller.join(new Student("Daley", 3579));
         System.out.println("conn");
         System.out.println(conn);
         System.out.println("miller");
         System.out.println(miller);
         System.out.println("union");
         System.out.println(conn.union(miller));
          System.out.println("");
          System.out.println("intersection");
         System.out.println(conn.intersection(miller));              
          
       }

    public void join(Student student) {
        club.add(student);
    }

    public String toString(){
        String x = "";
        for(Student s : club){
            x += " "+ s;
        }
        return x;
    }

    public HashSet<Student> union(cpClub temp) {
        HashSet<Student> unioned = new HashSet<Student>();
        for(Student s : club){
            unioned.add(s);
        }
        for(Student s: temp.getClub()){
            unioned.add(s);
        }

        return unioned;

    }

    private HashSet<Student> intersection(cpClub temp) {
        HashSet<Student> inter = new HashSet<Student>();
        for(Student s : temp.getClub()) {
            if(temp.getClub().contains(s)){
                inter.add(s);
            }
        }
        for(Student s : club) {
                if(club.contains(s)){
                    inter.add(s);
                }
        }

        return inter;
    }

}
