package Sets;

    public class Item implements Comparable<Item> {
        private int id;
        private int count;
    
        public Item(int id, int count) {
            this.id = id;
            this.count = count;
        }
    
        public int getId() {
            return this.id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public int getCount() {
            return this.count;
        }
    
        public void setCount(int count) {
            this.count = count;
        }
    
        @Override
        public int compareTo(Item other) {
            if (this.id < other.id) return -1;
            if (this.id > other.id) return 1;
            return 0;
        }
    
        @Override
        public String toString() {
            return  id + " " + count;
        }

        public int hashCode(){
            return (count * 31) * id;
    
        }
    
        public boolean equals(Object ot){
            if(ot == null){
                return false;
            }
            if(getClass() != ot.getClass()){
                return false;
            } 
            Item other = (Item) ot;
            return id == other.getId() && count == other.getCount();
        }
    }

  
    
    

