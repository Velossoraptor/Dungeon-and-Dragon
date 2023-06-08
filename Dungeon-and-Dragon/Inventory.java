/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory  //make it a linked list, items are the nodes
{
     private Item frontItem;
     private Item backItem;
     private int size;
     private int maxSize = 4;
     
     public Inventory(){
         this .frontItem = null;
         this.backItem = null;
         this.size = 0;
     }
 
     public void push(Item item) {
         this.add(item);
     }
     
     public void add(Item item){
        if (this.size == 0) {   // If inventory was empty, this item is also the new front item.
            this.frontItem = item;
        }
        else {
            // Set this item as the next item of the old back item.
            this.backItem.setNext(item); //setnext has to be added to item class
        }
     }
}
