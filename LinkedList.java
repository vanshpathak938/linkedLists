import java.util.*;  
public class LinkedList {
    public Node head;
    public int ListCount;
    public LinkedList()
    {
        head = new Node(4);
        ListCount = 1;
    }
    public void show()
    {
        Node current = head;
        while (current.next != null)
        {
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Final: " + current.data);
    }
    public void listLength()
    {
        Node current = head;
        int counter = 0;
        while(current != null)
        {
            counter++;
            current = current.next;
        }
        System.out.println("Length: " + counter);
    }
    public boolean addHead(int d)
    {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        return true;
    }
    public boolean addTail(int d)
    {
        Node newNode = new Node(d);
        Node current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.next = newNode;
        current = newNode;
        return true;
    }
    public boolean insert(int d)
    {
        Node newNode = new Node(d);
        Node current = head;
        if(newNode.data <= current.data)
        {
            newNode.next = head;
            head = newNode;
            return true;
        }
        else
        {
            while(current.next != null && newNode.data > current.next.data)
            {
                current = current.next;
            }
        newNode.next = current.next;
        current.next = newNode;
        return true;
        }
    }
    public boolean deleteHead()
    {
        Node current = head;
        head = head.next;
        return true;
    }
    public boolean deleteTail()
    {
        Node current = head;
        while(current.next.next != null)
        {
            current = current.next;
        }
        current.next = null;
        return true;
    }
    public boolean delete(int d)
    {
        Node current = head;
        while(current.next.next != null && current.next.data != d)
        {
            current = current.next;
        }
        if(current.next.data == d)
        {
            current.next = current.next.next;
        }
        else
        {
            System.out.println("Value not found");
            return false;
        }
        return true;
    }
    public boolean locate(int d)
    {
        Node current = head;
        int position = 0;
        while(current.next.next != null && current.next.data != d)
        {
            position++;
            current = current.next;
        }
        if(current.next.data == d)
        {
            System.out.println("Position --> " + position);
            return true;
        }
        else
        {
            System.out.println("Value not found");
            return false;
        }
    }
    public LinkedList reverse()
    {
        LinkedList reverse = new LinkedList();
        Node current = head;
        while(current != null)
        {
            reverse.addHead(current.data);
            current = current.next;
        }
        return reverse;
    }
    public int calcTotal()
    {
        Node current = head;
        int counter = 0;
        while (current.next != null)
        {
            counter += current.data;
            current = current.next;
        }
        counter += current.data;
        return counter;
    }
    public void oddGame()
    {
       boolean start = true;
       while(start == true){
       Scanner integer = new Scanner(System.in);
       System.out.println("Enter value to put into list");
       int number  = integer.nextInt();
       if(number%2 != 0 && number%5 != 0)
       {
          addTail(number); 
          show();
          System.out.println(calcTotal());
       }
       if(number%2 != 0 && number%5 == 0)
       {
          addHead(number*2); 
          show();
          System.out.println(calcTotal());
       }
       if(number%2 == 0 && number%5 != 0)
       {
          deleteTail();
          show();
          System.out.println(calcTotal());
       }
       if(number%2 == 0 && number%5 == 0)
       {
          deleteHead();
          show();
          System.out.println(calcTotal());
       }
       if(calcTotal() >= 100)
       {
          start = false;
          System.out.println("Total: " + calcTotal());
          show();
       }
       }
    }
    }
