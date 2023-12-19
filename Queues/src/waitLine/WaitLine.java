package src.waitLine;
import java.util.LinkedList;
import java.util.Queue;

public class WaitLine {
Queue<Patient> line;

public WaitLine() {
    line = new LinkedList<Patient>();
}
public void addPatient( Patient x) { 
    line.add(x);
}

public void addPatient (String name){
    line.add(new Patient(name));
}


public Patient nextInLine() {
    return line.peek();
}
// prints and removes the next patient in the queue
public void nextPatient() {
System.out.println(this.nextInLine());
line.poll();

}
public void displayQueue() {
System.out.println(line);
}
public long getAverageWaitTime(){
    long avg = 0;
    int count = 0;
    for(int i = 0; i < line.size(); i++) {
        avg += line.poll().getWaitTime();
        count++;
    }
    return avg/count;
}
// This method will return the number of patients in the waitLine
public int getPatientCount() {
return line.size();
}
//This method will return true if there is a patient with the name lookFor,
//false otherwise.
public boolean contains(String lookFor) {
    Queue<Patient> temp = new LinkedList<Patient>(line);
    Patient current = temp.poll();
while (current != null) {
    if(current.getName().equals(lookFor)){
        return true;
    }
    current = temp.poll();
}
return false;
}
}



