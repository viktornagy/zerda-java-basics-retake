package com.greenfox.exams.java.retake;

/**
 * Created by Viktor on 2016.12.12..
 */
public class F16 extends AirCraft {

    public F16(){
        this.typID="com.greenfox.exams.java.retake.F16";
    }

    @Override
    public String toString() {
        return "Type "+this.typID+ "Ammo "+this.actAmmo+ "Damage "+this.damage+ "All Damage "+this.fight();
    }


}
