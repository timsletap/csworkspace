package Sets;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Warehouse {
    private ArrayList<TreeSet<Item>> inventory;

    public Warehouse(String file) {
        inventory = new ArrayList<TreeSet<Item>>();
        try {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                int count = scanner.hasNextInt() ? scanner.nextInt() : 0;
                addToInventory(id, count);
            }
        } catch (IOException exception){
            System.out.println("Error processing file: " + exception);
        }
    }

    public void addToInventory(int lookFor, int count) {
        for (TreeSet<Item> set : inventory) {
            for (Item item : set) {
                if (item.getId() == lookFor) {
                    item.setCount(item.getCount() + count);
                    return;
                }
            }
        }
        TreeSet<Item> newItemSet = new TreeSet<>();
        newItemSet.add(new Item(lookFor, count));
        inventory.add(newItemSet);
    }
    

    public void printTable() {
        for (TreeSet<Item> items : inventory) {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public Item search(int id) {
        for (TreeSet<Item> set : inventory) {
            for (Item item : set) {
                if (item.getId() == id) {
                    return item;
                }
            }
        }
        return null;
    }

    public int getAverageCount() {
        int totalItems = 0;
        int totalCount = 0;
        for (TreeSet<Item> items : inventory) {
            for (Item item : items) {
                totalCount += item.getCount();
                totalItems++;
            }
        }
        return totalCount/totalItems;
    }

    public static void main(String[] args){
        Warehouse smit = new Warehouse("Sets//items.txt");
        //smit.printTable();
        System.out.println(smit.search(247));
        smit.addToInventory(247, 3);
        System.out.println(smit.search(247));
        System.out.println(smit.getAverageCount());

        
    }


}

    