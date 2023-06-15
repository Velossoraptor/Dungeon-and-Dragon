import greenfoot.*;

/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory extends Actor  //make it a linked list, items are the nodes
{
     private Item frontItem;
     private Item backItem;
     private int size;
     private int maxSize = 4;
     
     public void act(){
         GreenfootImage img = getImage(); 
         img.clear(); 
         img.setColor(Color.RED);
         img.drawRect(0,0,200,200);
         img.fillRect(0,0,200,200);
         img.scale(175,75);
         setImage(img);
         
         
     }
     
     public Inventory(){
         this.frontItem = null;
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
            this.backItem.setNext(item); 
        }
        
        // Make this item the new back item.
        this.backItem = item;

        // Update size.
        this.size++;
     }
     
    public void clear() {
        this.size = 0;
        this.frontItem = null;
        this.backItem = null;
    }
    
    public void remove(int index) {
        if (index < 0 || index > this.size){
            throw new IndexOutOfBoundsException(index);
        }

        Item currentItem = this.frontItem;
        int i = 0;
        while (i < index) {
            currentItem = currentItem.next();
            i++;
        }

        Item nextItem = currentItem.next();
        Item prevItem = currentItem.previous();
        if(prevItem!=null ){
            //nextItem.setPrevious(prevItem);
            prevItem.setNext(nextItem);
        }else{
            nextItem.setPrevious(null);
            this.frontItem = nextItem;
        }

        if(nextItem!=null){
            nextItem.setPrevious(prevItem);
        }else{
            prevItem.setNext(null);
            this.backItem = prevItem;
        }


        this.size--;
    }
    
    public String get(int index) {
        if (this.size == 0) {
            throw new UnsupportedOperationException("List is empty.");
        }

        if (index < 0 || index >= this.size)
            throw new IndexOutOfBoundsException(index);
        
        // Starting from front item, repeatedly get the next item index-1 times.
        Item currentItem = this.frontItem;
        int i = 0;
        while (i < index) {
            currentItem = currentItem.next();
            i++;
        }
        // Could make this into a for-loop instead. Or put into a private getItem(int) method that returns Item.

 
        return currentItem.name();
    }
    
    public Item current(){
        return this.frontItem;
    }
}
