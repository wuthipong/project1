/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentorarmy;

/**
 *
 * @author User
 */
public class Private extends Soilders{
    String position;

    public Private(String name) {
        super(name);
    }
    public Private(String name,String position){
        super(name,position);
    }
    public void showSoilderInfo(){
        System.out.println("Name is"+name+"\nPosition is"+position);
    }

}
