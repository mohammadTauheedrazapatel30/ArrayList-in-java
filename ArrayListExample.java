/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mohammad Tauheed
 */
public class ArrayListExample {
    
    public static void main(String[] args){
        
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("BMW");
        cars.add("Suzuki");
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Maruti");
        
        //normal For loop
        for(int i=0; i<cars.size(); i++){
            System.out.println("Cars : " + cars);
        } 
        
        System.out.println("---------------");
        
        for(int i=0;i<cars.size(); i++){
            System.out.println("Cars : " + cars.get(i));
        }
           System.out.println("---------------");
        //Enhanced For Loop
        for(String car : cars){
            System.out.println("Cars : " + car);
        }
        
        System.out.println("---------------");
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(20);
        numbers.add(10);
        numbers.add(5);
        
        for(int i=0; i < numbers.size();i++){
            System.out.println("Numbers : " + numbers);
        }
        
        System.out.println("--------------------"); 
        
        for(Integer number : numbers){
            System.out.println("Numbers using enhanced for loop : " + number);
        }
        
        System.out.println(numbers.size());
        
        Collections.sort(cars);
        
        System.out.println("Sorted Array of cars : " + cars);
        
        cars.remove(0);
         System.out.println("cars : " + cars);
    }
}
