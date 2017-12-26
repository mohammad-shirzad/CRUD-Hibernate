package core.designPattern.repository.baseEntity;

import core.designPattern.singleton.HibernateUtil;
import core.model.dto.BaseDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;
import java.util.Calendar;

public class BaseRepository<T extends BaseDto> implements IBaseRepository<T> {
    public Transaction transaction;
    public Session session;
    T t;
    public SessionFactory getSessionFactory(){
        return HibernateUtil.getSessionFactory();
    }
    @Override
    public T getById(Class<T> tClass, int id) {
        try{
         session=getSessionFactory().openSession();
         t = (T) session.get(tClass,id);
         session.close();
         return t;
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteById(Class<T> tClass, int id) {
        try{
            session=getSessionFactory().openSession();
            transaction = session.beginTransaction();
            t= (T) session.get(tClass,id);
            session.delete(t);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }

    @Override
    public void create(T t) {
        try{
            t.LastModificationDate=new Date(Calendar.getInstance().getTimeInMillis());
            session=getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(t);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }
}
