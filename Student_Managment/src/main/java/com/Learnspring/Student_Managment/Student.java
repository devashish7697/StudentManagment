package com.Learnspring.Student_Managment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String name;
    private String email;
    private String address;
    private String fathersName;
    private String phoneNumber;
    private String className;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersname(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", className='" + className + '\'' +
                '}';
    }
}
