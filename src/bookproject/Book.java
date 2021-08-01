
package bookproject;

public class Book {
    
    private String bookName;
    private int ISBNNumber;
    private String authorName;
    private String publisher;
    private double price;

    public Book(String bookName, int ISBNNumber) {
        this.bookName = bookName;
        this.ISBNNumber = ISBNNumber;
    }

    public Book(String authorName, String publisher, double price) {
        this.authorName = authorName;
        this.publisher = publisher;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public void updatePrice(){
        
        if(price < 200.0){
            price = price + (0.05 * price);
        }
        else{
            price = price + (0.03 * price);
        }
    }
    
    public void display() {
        System.out.println("The Name of book is: "+bookName);
        System.out.println("The ISBN Number of this book: "+ISBNNumber);
        System.out.println("The Author of this book: "+authorName);
        System.out.println("The Publisher of this book: "+publisher);
        System.out.println("The price of book is: "+price);
        System.out.println("");
    }
    
}
