package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {

    private int id;
    private double budget;
    private String department;
    private List<Administrator> administrators;

    public Manager(){}

    public Manager(String name, String nI, double salary, double budget,String department){
        super(name, nI, salary);
        this.budget = budget;
        this.department = department;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
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
