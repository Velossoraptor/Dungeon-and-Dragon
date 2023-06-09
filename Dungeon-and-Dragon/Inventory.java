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
        
        // Make this node the new back node.
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
        //giving me an issue
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
}
