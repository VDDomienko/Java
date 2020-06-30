package org.example.classes;

public class Student {
    private long Id;
    private String Surname;
    private String Name;
    private String MidName;
    private String DoB;
    private String Address;
    private int Phone;
    private String Faculty;
    private String Course;
    private String Group;

    public Student(long id, String surname, String name, String midname, String dob){
        this.Id = id;
        this.Surname = surname;
        this.Name = name;
        this.MidName = midname;
        this.DoB = dob;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getMidName() {
        return MidName;
    }

    public void setMiddleName(String midName) {
        this.MidName = midName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        this.DoB = doB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        this.Phone = phone;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        this.Faculty = faculty;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        this.Course = course;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        this.Group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Phone='" + Phone + '\'' +
                '}';
    }
}
