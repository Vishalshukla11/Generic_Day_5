public class Main 
{

    public static void main(String args[])
    {
        LinkedList<Integer> list= new LinkedList<>();//create a new Linklist 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        //print the list 
       list.PrintList();
       //add element in the beginning 
       list.addFirst(1);
       list.PrintList();
       //remove an element 
       list.remove(5);
       list.PrintList();
       //add element to the last of the list 
       list.addLast(10);
       list.PrintList();
       //remove first element to the list
       list.removeFirst();
       list.PrintList();
       //remove last element to the list 
       list.removeLast();
       list.PrintList();
       //get first element
       System.out.println(list.getFirst());
       //get last element
       System.out.println(list.getLast());
       //isEmpty 
       System.out.println(list.isEmpty());
       //to clear list
       System.out.println("after clear the list");
       list.clear();
       list.PrintList();
       System.out.println("LiskedList end");
       System.out.println("______________________________________________________________________");

       //method call for stack testing 
       System.out.println("Stack testing");
       StackLinkList<Integer> stack= new StackLinkList<>();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.push(6);
       stack.StackPrintList();
       System.out.println("Stack size is " + stack.size());
       System.out.println("pop method->" + stack.pop());
       stack.StackPrintList();
       System.out.println("peek element is ->" + stack.peek());
       System.out.println("after add element at bottom -> " );
       stack.pushAtBottom(10);
       stack.StackPrintList();  
       System.out.println("reverse -> "  );
       stack.reverse();stack.StackPrintList();
       System.out.println("stack testing end ");  
//-------------------------------------------------------------------------------------------
       System.out.println("_________________________________________________________");
       System.out.println("Queue Concept");
       QueuelinkedList<Integer> Queue= new QueuelinkedList<Integer>();
       Queue.add(1);
       Queue.add(2);
       Queue.add(3);
       Queue.add(5);
       Queue.printQueue();
       System.out.println("after offer method");
       Queue.offer(6);
       Queue.printQueue();
       Queue.remove();
       System.out.println("after remove method");
       Queue.printQueue();
       System.out.println("after poll method");
       Queue.poll();
       Queue.printQueue();
       System.out.println("after element method ");
       Queue.element();
       Queue.printQueue();
       System.out.println("after peek method");
       Queue.printQueue();
       System.out.println("after empty method");
       Queue.isEmpty();
       
       System.out.println("after size method ");
       Queue.size();
       System.out.println("end Queue");


       

    }
}