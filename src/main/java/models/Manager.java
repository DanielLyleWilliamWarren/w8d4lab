package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private double budget;
    private Department department;
    private List<Administrator> administrators;

    public Manager(){}

    public Manager(String name, String nI, double salary, double budget,Department department){
        super(name, nI, salary);
        this.budget = budget;
        this.department = department;
    }


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @OneToOne(mappedBy = "mentor", fetch = FetchType.LAZY)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @OneToMany(mappedBy="manager", fetch = FetchType.LAZY)
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }
}
