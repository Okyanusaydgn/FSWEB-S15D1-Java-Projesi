package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GroceryList {

    private ArrayList <String> items;

// java da "newlemek" yeni bir obje oluşturmak demek.
    public GroceryList(){
        this.items = new ArrayList<>();
    }


    public void addItems(String items){
        String[] splitItems = splitItems(items);
        for(String item : splitItems){
            String trimmedItem = item.trim();
            if(checkItemsInList(trimmedItem)){
                System.out.println(" Bu item zaten mevcut: " + item);
            } else {
                this.items.add(trimmedItem);
                sortItems();
            }
        }
    }

    public void removeItems(String items){
        String[] splitItems = splitItems(items);
        for(String item : splitItems){
            String trimmedItem = item.trim();
            if(!checkItemsInList(trimmedItem)){
                System.out.println(" Bu item listede mevcut değil : " + item);
            } else {
                this.items.remove(trimmedItem);
                //sortItems(); --> silerken sortitems ı kullanmamıza gerek yok.
            }
        }
    }

    public void printSorted(){
        System.out.println(" Mevcut pazar listesi:  ");
        for(String item : this.items){
            System.out.println(item);
        }
    }

    private boolean checkItemsInList(String trimmedItem) {
        return items.contains(trimmedItem);
    }

    private String [] splitItems(String items){
        return items.split(",");
    }

    public void sortItems(){
        Collections.sort(this.items); // arraylist i sıralamak için kullanıyoruz.
    }
}
