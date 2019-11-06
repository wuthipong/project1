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
public abstract class Animal {
    public abstract void see();
    public abstract void move();
    public abstract void cry();
    public void eat(){
        System.out.println("Nom Nom");
    }
    public void sleep(){
        System.out.println("Close eyes");
    }
}
