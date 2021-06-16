/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Constants;
import Modul.Cat;
import Modul.Dog;
import Modul.Duck;
import Modul.Horse;

/**
 *
 * @author Richard
 */
public class UIView implements Constants{
    public UIView(){
        Cat cat = new Cat("Snuffle", 5, C_FOOD, FEMALE, ALIVE);
        Dog dog = new Dog("Kelly", 7, D_FOOD, MALE, ALIVE);
        Duck duck = new Duck("Donald", 1, DU_FOOD, MALE, ALIVE);
        Horse horse = new Horse("Horsey", 10, H_FOOD, FEMALE, DEAD);
        
        System.out.println(cat.printData());
        System.out.println(dog.printData());
        System.out.println(duck.printData());
        System.out.println(horse.printData());
    }
}
