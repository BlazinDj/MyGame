
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public abstract class Book
{
   String title;
   String author;
   
   public Book(String t,String a)
   {
       this.title = t;
       this.author = a;
   }
   
   public abstract void display();
  
}

class Solution
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        String author = input.nextLine();
        int price = input.nextInt();
        Book new_novel = new MyBook(title,author,price);
        new_novel.display();
    }
}

class MyBook extends Book
{
    private int price;
    
    public MyBook(String title,String author,int price)
    {
        super(title,author);
        this.price = price;
    }
        
    public void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
        