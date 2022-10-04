
package library;


public class Page {
    private int pageNumber;
    private String content;
    
    
    public Page(int pageNumber, String content){
        this.content=content;
        this.pageNumber=pageNumber;
    }

    
    public int getPageNumber() {
        return this.pageNumber;
    }

    
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    
    public String getContent() {
        return this.content;
    }

    
    public void setContent(String content) {
        this.content = content;
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
}
