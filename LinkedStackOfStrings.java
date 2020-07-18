/**
 * Here I am working with the functionality of the Stack but using the linked link implementation
 */
public class LinkedStackOfStrings {
    private Node first=null;//this is means the first node is pointing to null;
    int size = 0;
    private class Node{
        String item;
        Node next;
    }

    /**
     * decrease the size of the stack
     * @return the first element in the stack
     */
        public String pop(){
        if(isEmpty()){
            return null;
        }
        String item=first.item;
        first=first.next;
        size--;
        return item;
        }

    /**
     * Push an item in the stack
     * @param insert this is the item to be inserted
     */
    public void push(String insert){
            Node head= first;
            System.out.println("Insertion is done");
            first=new Node();
            first.item=insert;
            size++;
            first.next=head;


        }

    /**
     * check if the stack is empty
     */
    public boolean isEmpty(){
        return (first==null);
        }

    /**
     * @return the size of the array
     */
    public int size() {
        return size;
        }


}
