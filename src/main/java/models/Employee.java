package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public abstract class Employee {

    private int id;
    private String name;
    private int nI;
    private double salary;


    public Employee(String name, int nI, double salary) {
        this.name = name;
        this.nI = nI;
        this.salary = salary;
    }

    public Employee() {
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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "nI")
    public int getnI() {
        return nI;
    }

    public void setnI(int nI) {
        this.nI = nI;
    }

    @Column(name = "salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
