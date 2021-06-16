/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul;

/**
 *
 * @author Richard
 */
abstract class Animal {
    public String name;
    public int age;
    public String food;
    public int gender;
    public int life;
    
    boolean isAlive(int status){
        return status == 1;
    }
    boolean Gender(int gender){
        return gender == 1;
    }
    
}
