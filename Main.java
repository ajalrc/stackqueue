import java.util.LinkedList;

public class Main {
    /**
     *Here we will be exploring the concept the stack and the queue
     * stack is the data structure where the concept is the use of first in first out
     * queue is the data structure where the concept is last in first out.
     */
    public static void main(String[] args) {

        Resizingarray linkedStackOfStrings= new Resizingarray(1);
        linkedStackOfStrings.push("Ajal");
        linkedStackOfStrings.push("is");
       linkedStackOfStrings.push("name");
       linkedStackOfStrings.push("My");
        System.out.println("The previous size is "+linkedStackOfStrings.size());
        System.out.println(linkedStackOfStrings.pop());
        System.out.println(linkedStackOfStrings.pop());
        System.out.println(linkedStackOfStrings.pop());
        System.out.println(linkedStackOfStrings.pop());
        System.out.println("The later size is "+linkedStackOfStrings.size());

        LinkedStackOfStrings linkedStackOfString= new LinkedStackOfStrings();
        linkedStackOfString.push("Ajal");
        linkedStackOfString.push("is");
        linkedStackOfString.push("name");
        linkedStackOfString.push("My");
        System.out.println("The previous size is "+linkedStackOfString.size());
        System.out.println(linkedStackOfString.pop());
        System.out.println(linkedStackOfString.pop());
        System.out.println(linkedStackOfString.pop());
        System.out.println(linkedStackOfString.pop());
        System.out.println("The later size is "+linkedStackOfString.size());

    }


}


