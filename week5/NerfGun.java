/**
 * Burussakorn Ruangon
 * ID: 632115028
 * e-mail: burussakorn_ruangon@elearning.cmu.ac.th
 */

public class NerfGun {
    private int ammo = 0;
    private int gunID = 1;

    //Object NerfGun.
    public NerfGun(){}
    
    //Fills initial ammo.
    public NerfGun(int ammo){
        this.ammo = ammo;
        gunID++;
    }
    //Refill ammo. (limit of 15)
    public void reload(int reload){
        if(ammo+reload>15){
            System.out.println("Error !! Overloaded ammunition.");
        }
        else{
            ammo = ammo + reload;
        }  
    }
    //Fires a bullet.
    public void fire(){
        if(ammo == 0){
            System.out.println("There is no ammunition.");
        }   
        else{
            ammo--;
            System.out.println("BANG !!!");
        }
    }
    //Display the amount of bullets in the magazine.
    public void displayNumOfAmmunition(){
        System.out.println(ammo+" bullets left.");
    }
    //Displays the gun's ID.
    public void displayGunID(){
        System.out.println("The ID of this gun is "+gunID);
    }

}