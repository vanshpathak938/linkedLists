import java.util.*;  
public class LISP {
    public static void main(String[] args) {
        LinkedList potter = new LinkedList();
        Scanner integer = new Scanner(System.in);
        
        System.out.println("1.Stack\n2.Queue");
        int answer  = integer.nextInt();
        
        if(answer == 1)
            System.out.println("Stack Selected");
        {
        boolean start = true; 
        while(start == true)
        {
            System.out.println("1.Push\n2.Pop\n3.Reverse\n4.Display\n5.Find\n6.Quit");
            int answer2  = integer.nextInt();
            if(answer2 == 1)
            {
                System.out.println("Enter number to push");
                int number  = integer.nextInt();
                potter.addTail(number);
            }
            if(answer2 == 2)
            {
                potter.deleteHead();
            }
            if(answer2 == 3)
            {
                potter.reverse();
            }
            if(answer2 == 4)
            {
                potter.show();
            }
            if(answer2 == 5)
            {
                System.out.println("Enter number to find");
                int number2  = integer.nextInt();
                potter.locate(number2);
            }
            if(answer2 == 6)
            {
                start = false;
            }
        }
        }
        
        if(answer == 2)
        {
            System.out.println("Queue Selected");
        boolean start = true; 
        while(start == true)
        {
            System.out.println("1.Push\n2.Pop\n3.Reverse\n4.Display\n5.Find\n6.Quit");
            int answer2  = integer.nextInt();
            if(answer2 == 1)
            {
                System.out.println("Enter number to push");
                int number  = integer.nextInt();
                potter.addTail(number);
            }
            if(answer2 == 2)
            {
                potter.deleteTail();
            }
            if(answer2 == 3)
            {
                potter = potter.reverse();
            }
            if(answer2 == 4)
            {
                potter.show();
            }
            if(answer2 == 5)
            {
                System.out.println("Enter number to find");
                int number2  = integer.nextInt();
                potter.locate(number2);
            }
            if(answer2 == 6)
            {
                start = false;
            }
        }
        }
        
        
    }
}
