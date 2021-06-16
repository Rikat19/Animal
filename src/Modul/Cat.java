/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul;

import Controller.NewInterface;

/**
 *
 * @author Richard
 */
public class Cat extends Animal implements NewInterface {
    
    public Cat(String name, int age, String food, int gender, int life){
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.life = life;
    }
    
    @Override
    public void printSound(){
        System.out.println("miaw");
    }
    
    @Override
    public String printData(){
        String data = "Name: " + this.name +
                "\nAge: " + this.age +
                "\nFood: " + this.food +
                "\nGender: " + this.gender +
                "\nStatus: " + this.life + "\n";
        return data;
    }
}

