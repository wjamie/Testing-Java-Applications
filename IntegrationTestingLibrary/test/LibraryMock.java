
import java.util.ArrayList;
import java.util.Collection;
import plymouth.isad.libary.Book;
import plymouth.isad.libary.ILibrary;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jwalker15
 */
public class LibraryMock implements ILibrary{

       ArrayList<Book> books = new ArrayList<>();
 
    public void createBooks() {
    
       books = new ArrayList<>();
        
       books.add(new Book("Adventures of The Lost Spoon", "Paul Di Resta", true));
       books.add(new Book("Merry Berries Christmas Cooking", "Mary Berry", true));
       books.add(new Book("Painting Annual 2012", "Bob Ross", false));
    }

    @Override
    public  ArrayList<Book> getBooks() {
       return books;
    }
    
    
    
   
}
