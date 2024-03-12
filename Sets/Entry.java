package Sets;

public class Entry {

    String name;
    String phoneNum;

    public Entry(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    
    public int hashCode() {
        int h = 0;
        int len = name.length();
        for(int i = 0; i < len; i++){
            h = 31 * h+ name.charAt(i);
        }
        return h + phoneNum.length();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entry other = (Entry) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phoneNum != other.phoneNum)
            return false;
        return true;
    }

    public String toString(){
        return this.getName() + " " + this.getPhoneNum();

    }

   

    

    
}
