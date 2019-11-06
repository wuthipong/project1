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
import java.util.ArrayList;
public class Squad {
    String name;
    int member;
    Commander squadLeader;
    ArrayList<Soilders> fireteam = new ArrayList<Soilders> (); 
    
    public Squad(String name){
        this.name = name;
    }
    public void addSoilder(Soilders s){
        fireteam.add(s);
    }
    public void removeSoilder(String name){
        fireteam.remove(s);
    }
    public void listMember(){
        
    }
    public Commander getSquadLeader(){
        return squadLeader;
    }
    public void showsquadInfo(){
        
    }
}
