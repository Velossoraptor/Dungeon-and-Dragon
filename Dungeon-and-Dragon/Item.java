/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item  
{
    // instance variables - replace the example below with your own
    private Item next;
    private Item prev;
    private int buff;
    private String name;

    /* adjust all this for Item class as node, and inventory as list
    public void setValue(Object newValue){
        this.value = newValue;
    }
    */
   public void act(){

   }
   
    public int buff() {
        return this.buff;
    }
    
    public String name(){
        return this.name;
    }


    public Item previous() {
        return this.prev;
    }

    public void setPrevious(Item item) {
        this.prev = item;
    }

    public Item next() {
        return this.next;
    }

    public void setNext(Item item) {
        this.next = item;
    }
    
}
