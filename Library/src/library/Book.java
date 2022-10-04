/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


public class Book {
    
    private String name;
    private String author;
    private String publisher;
    private Page[] pages;
    private int pageCount;
    
    public Book(String name, String author, String publisher, int pageCount){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.pageCount=pageCount;
        this.pages= new Page[pageCount];
        
        }

   public void addPage(Page p){
       this.pages[p.getPageNumber()]=p;
   }
    public String getPage(int num){
        return this.pages[num].getContent();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    
    
    
}
