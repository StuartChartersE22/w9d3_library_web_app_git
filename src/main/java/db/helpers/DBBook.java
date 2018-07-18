package db.helpers;

import db.DBHelper;
import db.HibernateUtil;
import models.Book;
import models.Borrower;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBBook extends DBHelper {

    public Book find(int id){
        return find(id, Book.class);
    }

    public List<Book> getAll(){
        return getAll(Book.class);
    }

    public void deleteAll(){
        deleteAll(Book.class);
    }

    public Borrower getBorrowerForBook(Book book){
        return getAnAssociationForAnObject(book, Borrower.class, "itemsBorrowed");
    }
//    public Borrower getBorrowerForBook(Book book){
//        Borrower borrower = null;
//        session = HibernateUtil.getSessionFactory().openSession();
//
//        try {
//            Criteria cr = session.createCriteria(Borrower.class);
//            cr.createAlias("books", "single_object");
//            cr.add(Restrictions.eq("single_object.id", book.getId()));
//            borrower = (Borrower)cr.uniqueResult();
//        }catch (HibernateException e){
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
//        return borrower;
//    }

}
