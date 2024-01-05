import java.util.*;
public class ListMenu {
    public static void main(String[] args) {
        LinkedList potter = new LinkedList();
        Scanner integer = new Scanner(System.in);
        
        boolean start = true;
        while(start == true)
        {
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Length\n5.Quit/End");
            int answer  = integer.nextInt();
            
            if(answer == 1)
            {
                System.out.println("Type number to insert");
                int num  = integer.nextInt();
                potter.insert(num);
            }
            
            if(answer == 2)
            {
                System.out.println("Type number to delete");
                int num2  = integer.nextInt();
                potter.insert(num2);
            }
            
            if(answer == 3)
            {
                potter.show();
            }
            
            if(answer == 4)
            {
                potter.listLength();
            }
            
            if(answer == 5)
            {
                start = false;
            }
        }
    }
}
