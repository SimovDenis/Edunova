package edunova.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Denis
 */
public class HibernateUtil {

    private static Session session = null;

    private HibernateUtil() {

    }

    public static Session getSession() {
        if (session == null) {
            session = new Configuration().configure().buildSessionFactory().openSession();
        }
        return session;
    }

}
