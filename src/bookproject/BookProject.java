
package bookproject;

public class BookProject {
    
    public static void main(String[] args) {
        
        Book book[] = new Book[10];
        
        book[0] = new Book("Don Quixote",455334);
        book[1] = new Book("A Tale of Two Cities",237462);
        book[2] = new Book("The Lord of the Rings",32452);
        book[3] = new Book("The Little Prince",41323);
        book[4] = new Book("Harry Potter and the Sorcerer's Stone",23111);
        book[5] = new Book("James Joyce","Thomson Reuters",230.0);
        book[6] = new Book("Vladimir Nabokov","Penguin Random House",450.0);
        book[7] = new Book("Fyodor Dostoevsky","Hachette Livre",250.0);
        book[8] = new Book("William Faulkner","HarperCollins",640.0);
        book[9] = new Book("Charles Dickens","Macmillan Publishers",920.0);
        
        book[0].display();
        book[1].display();
        book[2].display();
        book[3].display();
        book[4].display();
        book[5].display();
        book[6].display();
        book[7].display();
        book[8].display();
        book[9].display();
        
        
        
       
    }
    
}
