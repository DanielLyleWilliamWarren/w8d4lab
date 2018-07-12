import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Manager;

import java.util.List;


public class Runner {

    public static void main (String[] args){

        Manager manager1 = new Manager("Joe", "125436SR", 1900.00, 24000.00);
        Manager manager2 = new Manager("Rachel", "173636SR", 2100.00, 18000.00);
        DBHelper.save(manager1);
        DBHelper.save(manager2);

        Department department1 = new Department("Sports", manager1);
        Department department2 = new Department("Marketing", manager2);
        DBHelper.save(department1);
        DBHelper.save(department2);

        Administrator administrator1 = new Administrator("Jane", "437232AS", 1200.00, manager1);
        Administrator administrator2 = new Administrator("Mathew", "873222GS", 1200.00, manager1);
        Administrator administrator3 = new Administrator("Lukas", "346232AS", 1200.00, manager2);
        Administrator administrator4 = new Administrator("Jane", "985332AS", 1200.00, manager2);
        DBHelper.save(administrator1);
        DBHelper.save(administrator2);
        DBHelper.save(administrator3);
        DBHelper.save(administrator4);

        List<Administrator> foundAdministrators = DBManager.getManagersAdmins(manager1);
    }
}
