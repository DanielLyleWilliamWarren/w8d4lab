package db;

import models.Administrator;
import models.Department;
import models.Manager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBManager {

    public static Session session;

    public static List<Administrator> getManagersAdmins(Manager manager){
        List<Administrator> results = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Criteria cr = session.createCriteria(Administrator.class);
            cr.add(Restrictions.eq("manager", manager)); // ADDED
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;

    }

    public static Department getDepartment(Manager manager){
        session = HibernateUtil.getSessionFactory().openSession();
        Department department = null;

        try {
            Criteria cr = session.createCriteria(Department.class);
            cr.add(Restrictions.eq("manager", manager));
            department = (Department)cr.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return department;
    }
}
