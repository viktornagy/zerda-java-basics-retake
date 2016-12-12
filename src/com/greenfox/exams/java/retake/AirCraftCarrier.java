package com.greenfox.exams.java.retake;

import java.util.ArrayList;

/**
 * Created by Viktor on 2016.12.12..
 */
public class AirCraftCarrier {

    public class AircraftCarrier {

        public AircraftCarrier(int ammo){
            this.ammo=ammo;
            this.healtPoint=3000;
            this.aircrafts=new ArrayList<AirCraft>();
        }

        Integer ammo;
        Integer healtPoint;
        ArrayList<AirCraft> aircrafts;

        public  void addAircraft(String typ) {
            switch (typ) {
                case "com.greenfox.exams.java.retake.F16":
                    this.aircrafts.add(new F16());
                    break;

                case "com.greenfox.exams.java.retake.F35":
                    this.aircrafts.add(new F35());
                    break;

                default:
                    break;

            }
        }

        public String getAircrafts(){
            String s="";
            for(AirCraft a:this.aircrafts){
                s+=a.toString();
            }
        }


        @Override
        public String toString(){
            return "AircraftCount: "+this.aircrafts.size()+"Ammo: "+this.ammo;
        }
    }

}

