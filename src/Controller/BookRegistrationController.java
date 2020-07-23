/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.BookRegistrationHelper;
import DAO.BookDAO;
import Model.Book;
import Model.ImageFile;
import Model.Time;
import View.BookRegistrationView;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author hylan
 */
public class BookRegistrationController {

    private final BookRegistrationView view;
    private final BookDAO bookDao;
    private final BookRegistrationHelper helper;
    
    public BookRegistrationController(BookRegistrationView view) {
        this.view = view;
        this.bookDao = new BookDAO();
        this.helper = new BookRegistrationHelper(view);
    }
    
    public void NewBook(){
        
     String Author = helper.getAuthor();
     String Genre = helper.getGenre();
     String Name = helper.getName();
     int stock = helper.getStock();
     String Publisher = helper.getPublisher();
        Book book = null;
     
        java.sql.Date acquired = helper.getAcquiredDate();   
        
        book.setAcquired(acquired);
        book.setAuthor(Author);
        book.setGenre(Genre);
        book.setName(Name);
        book.setPublisher(Publisher);
        book.setStock(stock);
     
     if (bookDao.insert(book)){
       
         JOptionPane.showMessageDialog(view, "O livro: "+book.getName()+", foi salvo com sucesso");
     }
    }

    public void resize(JLabel jLabelImage) {

        ImageFile.resizeImage(jLabelImage, "/View/Images/icons8-no-image-64px.png");
    }

    public void start() {
        
        Date date = new Date();
        
        String string = Time.getDateFormat().format(date);
        
      view.getjFormattedTextFieldAcquisition().setText(string);  
    }
}