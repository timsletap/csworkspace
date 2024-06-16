package heaps;


public class WorkOrder implements Comparable<WorkOrder>  {


    private int priority;
    private String job;



    public WorkOrder(int priority, String job){
        this.priority = priority;
        this.job = job;
    }


    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public int compareTo(WorkOrder o) {
        if (this.priority < o.priority) {
            return -1;
        } else if (this.priority > o.priority) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Priority: " + getPriority() + ", Job: " + getJob() + "";
    }


    public static void main(String[] args){
        MinHeap temp = new MinHeap();
        temp.add(new WorkOrder(3, "Shampoo carpets"));
        temp.add(new WorkOrder(1, "Fix broken sink"));
        temp.add(new WorkOrder(2, "Order cleaning supplies"));
        temp.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
        temp.add(new WorkOrder(7, "Shampoo carpets"));
        temp.add(new WorkOrder(8, "Water plants"));
        while (temp.size() > 0) {
           System.out.println(temp.remove());  
        }
    }
}

    
    

