/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;


public class Library {

    private Book[] books;
    private int maxBookCount;
    private int currentIndex;
    
    public Library(int bookCount){
        this.maxBookCount = bookCount;
        this.books = new Book[bookCount];
        this.currentIndex = 0;
    }
    
    public void addBook(Book b){
        if(!isFull()){
        this.books[this.currentIndex]=b;
        this.currentIndex++;}
        else{
            System.out.println("The Library is Full!!");
        }
    }
    public boolean isFull(){
        return this.currentIndex >= this.maxBookCount;
    }
    public Book getBook(String bookName){
        for(int i = 0; i<this.currentIndex; i++){
            String tempName = books[i].getName();
            if(tempName.equals(bookName)){
                return books[i];
            }
        }
        System.out.println("-Book doesn't Exist-");
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Page a1 = new Page(0,"Chapter'0': Jean Valjean");
        Page a2 = new Page(1,"Chapter'1': Cosette Tholomyes");
        Book b1 = new Book("Sefiller","Victor Hugo","İş Bankası",2);
        b1.addPage(a1);
        b1.addPage(a2);
        Page a3 = new Page(0,"Chapter'0': Witch");
        Page a4 = new Page(1,"Chapter'1': Hansel and Gretel");
        Book b2 = new Book("Hansel&Gretel","Grimm Brothers","İş Bankası",2);
        b2.addPage(a3);
        b2.addPage(a4);
        Page a5 = new Page(0,"Chapter'0': Lord Voldemort");
        Page a6 = new Page(1,"Chapter'1': Draco Malfoy");
        Book b3 = new Book("Harry Potter","J.K.Rowling","İş Bankası",2);
        b3.addPage(a5);
        b3.addPage(a6);
        Page a7 = new Page(0,"Chapter'0': Gollum");
        Page a8 = new Page(1,"Chapter'1': Legolas");
        Book b4 = new Book("Lord of the Rings","J.R.R.Tolkien","İş Bankası",2);
        b4.addPage(a7);
        b4.addPage(a8);
        Page a9 = new Page(0,"Chapter'0': Bilbo Baggins");
        Page a10 = new Page(1,"Chapter'1': Gandalf");
        Book b5 = new Book("Hobbit","J.R.R.Tolkien","İş Bankası",2);
        b5.addPage(a9);
        b5.addPage(a10);
        
        Library l1 = new Library(5);
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.addBook(b4);
        l1.addBook(b5);
        
        
        System.out.println("Enter the Book Name: ");
        String whichBook = sc.nextLine();
        
         Book a = l1.getBook(whichBook);
       
        if(a != null){
        for(int i = 0; i<a.getPageCount();i++){
            System.out.println(i+".Page");
            System.out.println(a.getPage(i));
        }
        }
        else{
            System.out.println("-Page not Found-");
        }
    }
    
}
