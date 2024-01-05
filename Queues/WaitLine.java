
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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

public static void main(String[] args){
    WaitLine waitLine = new WaitLine();
    Scanner scanner = new Scanner(System.in);

    int choice;
    do {
        
        System.out.println("Menu");
        System.out.println("1. Add Patient");
        System.out.println("2. Next Patient");
        System.out.println("3. Average Wait Time");
        System.out.println("4. Display Queue");
        System.out.println("5. End");
        System.out.print("Type 1, 2, 3, 4, or 5: ");

        choice = scanner.nextInt();

        scanner.nextLine();
        if (choice == 1) {
            System.out.print("Enter patient name: ");
            String patientName = scanner.nextLine();
            waitLine.addPatient(patientName);
            System.out.println("Patient Added!");
            
        } 
        if (choice == 2) {
            if (waitLine.getPatientCount() > 0) {
                waitLine.nextPatient();
            } else {
                System.out.println("Queue is empty.");
            }
        } 
        if (choice == 3) {
            System.out.println("Average Wait Time: " + waitLine.getAverageWaitTime());
        } 
        if (choice == 4) {
            System.out.println("Queue: ");
            waitLine.displayQueue();
        } 
        if (choice == 5) {
            System.out.println("End");
        } 
        if(choice < 0 || choice > 5) {
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

    } while (choice != 5);
    scanner.close();
    
}
}




