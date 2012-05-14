/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yit.yschoolmini.lukshica.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lukshy
 */
public class StudentDB {
     private final static List<Student> students;
	
	static{
		Student kamala = new Student("S1", "kamala", "Jaffna Town", "2" ,"Kanthasamy");
		Student tharsan = new Student("S2", "Tharsan","Vavuniya","3", "Balakumar");
		Student mala = new Student("S3", "Mala", "kopay", "5","Thevaraja");
		Student ramesh = new Student("S4", "Ramesh", "Jaffna Town","12","Ratnam");
		Student vasan = new Student("S5", "Vasan", "Manipay", "10","Velayutham");
       
                students = new ArrayList<Student>();
		students.add(kamala);
		students.add(tharsan);
		students.add(mala);
		students.add(ramesh);
		students.add(vasan);
		
	}
        
        
    public static void addStudent(Student student){
                Student s=new Student();
                s.setAdmno(student.getAdmno());
                s.setName(student.getName());
                s.setAddress(student.getAddress());
                s.setGrade(student.getGrade());
                s.setParentName(student.getParentName());
                students.add(s);
                System.out.println("Student Name :" + s.getName());
	}
    public static void updateStudent(Student student){
            for(Student s : students){
                if(s.getAdmno().equals(student.getAdmno()))
                 {
                    s.setName(student.getName());
                    s.setAddress(student.getAddress());
                    s.setGrade(student.getGrade());
                    s.setParentName(student.getParentName());
                }
            }
	}
    
    public static List<Student> getStudents(){
		return students;
	}
    
}
