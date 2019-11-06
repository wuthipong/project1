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
public class Soilders {
    public String name;
    private String rank;
    Squad squad;

    public Soilders(String name){
       this.name = name;
    }
    public Soilders(String name,String rank){
       this .name = name;
       this.rank = rank;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String job){
        this.rank = job;
    }
    public void showSoilderInfo(){
        System.out.println("Soilder name is"+name+"\nRank is"+rank+"Squad is"+squad);
    }
}
