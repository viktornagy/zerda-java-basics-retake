
/**
 * Created by Viktor on 2016.11.21..
 */
public class TheFlower extends Plant {

    public TheFlower(String color) {
        super(color,0);
    }

 /*   public TheFlower(String color, int currentWaterAmount) {
        super(color,currentWaterAmount);
    }
*/
    @Override
    public boolean isThirsty() {
        return currentWaterAmount<5;
    }

    @Override
    public void water(int waterPerPlant) {
        currentWaterAmount += (int)((double)waterPerPlant*0.75);

    }
}
