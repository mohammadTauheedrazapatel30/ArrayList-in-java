/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.collection;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Tauheed
 */
public class RunStudent {
    
    public static void main(String[] args){
        
        ArrayList<Student> student = new ArrayList<>();
        
        Student std = new Student(1, "Shubham", "Mankapur", "shubhamgaur@gmail.com", 10);
        Student std1 = new Student(2, "Tauheed", "Sadar", "tauheedpatel@gmail.com", 11);
        
        student.add(std);
        student.add(std1);
        
        //normal for loop
        for(int i=0; i < student.size();i++){
            System.out.println(student.get(i));
        }
        System.out.println("-----------------------");
        //Enhanced For loop
        for(Student students : student){
            
            System.out.println(students);
            
        }
    }
}
