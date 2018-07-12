package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee{

    private Manager manager;

    public Administrator(){}

    public Administrator(String name, String nI, double salary, Manager manager){
        super(name, nI, salary);
        this.manager = manager;
    }

//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
