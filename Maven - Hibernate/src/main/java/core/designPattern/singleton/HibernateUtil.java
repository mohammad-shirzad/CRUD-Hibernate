package core.designPattern.singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory=new Configuration().configure()
            .buildSessionFactory();
    private HibernateUtil(){
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
