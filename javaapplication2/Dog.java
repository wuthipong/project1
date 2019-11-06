/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class Dog extends Animal implements Flyable{
    public void see(){
        System.out.println("With you");
    }
    public void move(){
        System.out.println("Walk");
    }
    public void cry(){
        System.out.println("Bark!");
    }
    public void fly(){
        System.out.println("Flap Flap");
    }
}
