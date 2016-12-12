/**
 * Created by Viktor on 2016.11.21..
 */
public class TheTree extends Plant{


    public TheTree(String color) {
        super(color,0);
    }

    @Override
    public boolean isThirsty() {
        return currentWaterAmount < 10;
    }

    @Override
    public void water(int waterPerPlant){
        currentWaterAmount += (int)((float)waterPerPlant*0.4);
    }
}

