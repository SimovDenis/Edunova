package edunova;

import edunova.util.HibernateUtil;

/**
 *
 * @author Denis
 */
public class Start {

    public static void main(String[] args) {
        HibernateUtil.getSession();
    }
}
