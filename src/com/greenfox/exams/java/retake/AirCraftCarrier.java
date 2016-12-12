package com.greenfox.exams.java.retake;
import java.util.ArrayList;

/**
 * Created by Viktor on 2016.12.12..
 */
public class AirCraftCarrier {

        public AirCraftCarrier(int ammo){
            this.ammo=ammo;
            this.healtPoint=3000;
            this.airCrafts=new ArrayList<AirCraft>();
        }

        Integer ammo;
        Integer healtPoint;
        ArrayList<AirCraft> airCrafts;

        public  void addAircraft(String typ) {
            switch (typ) {
                case "F16":
                    this.airCrafts.add(new F16());
                    break;

                case "F35":
                    this.airCrafts.add(new F35());
                    break;

                default:
                    break;

            }
        }

        public String getAircrafts(){
            String s="";
            for(AirCraft a:this.airCrafts){
                s+=a.toString();
            }
            return
        }


        @Override
        public String toString(){
            return "AircraftCount: "+this.airCrafts.size()+"Ammo: "+this.ammo;
        }
    }

}

