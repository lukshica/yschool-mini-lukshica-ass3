/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yit.yschoolmini.lukshica.managedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.yit.yschoolmini.lukshica.data.Student;
import org.yit.yschoolmini.lukshica.data.StudentDB;

/**
 *
 * @author Lukshy
 */
@ManagedBean
@RequestScoped
public class myManagedBean {

    private List<Student> students;
    private Student selectedStudent;
    private String message;
    private Student createStudent;

    public myManagedBean() {
        students = StudentDB.getStudents();
        selectedStudent = new Student();
        createStudent=new Student();
    }

    public void prepareCreate() {
        setSelectedStudent(createStudent);
        StudentDB.addStudent(selectedStudent);
         FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "User successfully added.", null));    
    }        
    public void update() {
     StudentDB.updateStudent(selectedStudent);
     FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "User successfully updated.", null));        
    }
    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Student getCreateStudent() {
        return createStudent;
    }
    
    public void setCreateStudent(Student createStudent) {
        this.createStudent=createStudent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
