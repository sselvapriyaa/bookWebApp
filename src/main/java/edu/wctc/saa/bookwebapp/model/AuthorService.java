
package edu.wctc.saa.bookwebapp.model;

import java.util.ArrayList;
import java.util.ArrayList;
import javax.swing.text.DateFormatter;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Gladwin
 */
public class AuthorService {
     private ArrayList<Author> authors;
    
    public AuthorService(){
        authors=new ArrayList<Author>();
        authors.add(new Author("Antonio Goncalves",1,new Date()));
        authors.add(new Author("Tonny Gaddis",2,new Date()));
        authors.add(new Author("Freeman & Robson",3,new Date()));
    }
    
    public ArrayList getAllAuthors(){
        return authors;
    }
    
    public void addAuthor(Author a){
        authors.add(a);
    }
}

 

