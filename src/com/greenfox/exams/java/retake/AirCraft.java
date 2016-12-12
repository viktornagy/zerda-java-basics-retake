package com.greenfox.exams.java.retake;

/**
 * Created by Viktor on 2016.12.12..
 */
public abstract class AirCraft {
    String typID;
    Integer maxAmmo;
    Integer damage;
    Integer actAmmo;

    public int fight(){
        return this.actAmmo*damage;
    }

    public int refill(Integer plusammo)
    {
        if((this.actAmmo+plusammo)>this.maxAmmo)
        {
            this.actAmmo=this.maxAmmo;
            return (this.actAmmo+plusammo)-this.maxAmmo;
        }
        else
        {
            this.actAmmo+=plusammo;
            return 0;
        }
    }
}
