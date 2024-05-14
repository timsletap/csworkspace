package Trees;

public class PhoneEntry implements Comparable<PhoneEntry> {

    private String name;
    private String num;


    public PhoneEntry(String name, String number) {
        this.name = name;
        this.num = number;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getNum() {
        return num;
    }


    public void setNum(String num) {
        this.num = num;
    }

    

    @Override
    public int compareTo(PhoneEntry o) {
        PhoneEntry temp = (PhoneEntry) o;
        return this.name.compareTo(temp.getName());
    }

    public String toString(){
        return "Name: " + this.getName() + " Number: "+ this.getNum();
    }

    



}
