/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yit.yschoolmini.lukshica.data;

/**
 *
 * @author Lukshy
 */
public class Student {
    private String admno;
    private String name;
    private String address;
    private String grade;
    private String parentName;
    
     
    public Student() {
    }

    public Student(String admno, String name, String address, String grade, String parentName) {
        this.admno = admno;
        this.name = name;
        this.address = address;
        this.grade = grade;
        this.parentName = parentName;   
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdmno() {
        return admno;
    }

    public void setAdmno(String admno) {
        this.admno = admno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

}
