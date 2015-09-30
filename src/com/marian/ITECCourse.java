package com.marian;
import java.util.ArrayList;
/**
 * Created by marian on 9/30/2015.
 */
public class ITECCourse {
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;

    public String getCourseName(){
        return this.name;
    }

    public void setCourseName(String newName) {
        this.name = newName;
    }
    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    //Constructor
    ITECCourse(String courseName,
               int courseCode, int courseMaxStudents) {
        this.name = courseName;

        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    void addStudent(String studentName) {
        //don't need to check if students ArrayList is null –

        //we know that the constructor set it up
        //students.add(studentName);
        System.out.println(studentName + " was added to " + this.name);
        if (students.size() == maxStudents) {
            System.out.println("Course is full – can't add " + studentName);
        } else {
            students.add(studentName);
        }

    }
   // void addStudent (String studentName) {

       // if (students.size() == maxStudents) {
            //System.out.println("Course is full – can't add " + studentName);
        //} else {
            //students.add(studentName);



    void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
    }

    int getNumberOfStudents() {
        return this.students.size();
    }

    void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }


    public int getMaxStudents() {
        return maxStudents;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }
}




