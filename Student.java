/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.collection;

/**
 *
 * @author Mohammad Tauheed
 */
public class Student {
    
    //States
    private int id;
    private String name;
    private String address;
    private String email;
    private int rollNo;
    
    //Characteristics | methods

    public Student() {
    }

    public Student(int id, String name, String address, String email, int rollNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.rollNo = rollNo;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", rollNo=" + rollNo + '}';
    }
    
    
}
