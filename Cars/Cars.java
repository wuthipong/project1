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
public abstract class Cars {
    public double weight ;
    private String license;
    public double speed;
    public abstract void move(double dis);
    public abstract void stop();
    public abstract void back();
    public void setLicense(String l){
        license = l;
    }
    public String getLicense(){
        return license;
    }
}
