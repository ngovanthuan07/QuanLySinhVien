/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author ngova
 */
public class Student{
    private int id;
    private String name;
    private double aver;

    public Student() {
    }

    public Student(int id, String name, double aver) {
        this.id = id;
        this.name = name;
        this.aver = aver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAver() {
        return aver;
    }

    public void setAver(double aver) {
        this.aver = aver;
    }
}
