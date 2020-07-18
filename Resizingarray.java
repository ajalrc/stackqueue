public class Resizingarray {
    private int pointer=1;
    private String[] stringlist;
    private int capacity;
    public Resizingarray(int capacity){
        this.capacity=capacity;
        stringlist=new String[capacity];
    }
    public void push(String string){
        //return the item at index pointer and increment it my 1
        if(pointer==capacity) resizingarray(2*capacity);
        stringlist[pointer++]=string;


    }
    private void resizingarray(int newsize){
        String[] newlist=new String[newsize];
        for(int i=0;i<pointer;i++){
            newlist[i]=stringlist[i];
        }
        stringlist=newlist;
    }
    public String pop(){
        if(isEmpty()) throw new IndexOutOfBoundsException();
        //decrement the pointer by 1 and return the item at the pointer
        /**
         * In the code below we have the problem called loitering meaning the reference to the object is still there
         * To prevent that we have to assign null to that index so that the garbage collector would collect the unused index
         * String item=stringlist[--pointer];
         * stringlist[pointer]=null;
         * return item;
         */

        String item= stringlist[--pointer];
        stringlist[pointer]=null;
        if(pointer==capacity/2) resizingarray(capacity/4);
        return item;
    }
    public boolean isEmpty(){
        return pointer==0;
    }
    public int size(){
        return pointer;
    }


}
