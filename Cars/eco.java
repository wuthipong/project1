/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;

/**
 *
 * @author User
 */
public class eco extends Cars{
        public eco (String l){
        setLicense(l);
        speed = 80;
    }
    public void move(double dis){
        System.out.println("Use "+dis/speed+"hours");
    }
    public void stop(){
        System.out.println("Break!!");
    }
    public void back(){
        System.out.println("Peep Peep");
    }
}
