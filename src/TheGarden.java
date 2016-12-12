import java.util.ArrayList;

/**
 * Created by Viktor on 2016.11.21..
 */
public class TheGarden extends ArrayList<Plant> {

    public String water(int amount) {
        int numberOfThirsty =0;
        for (Plant p : this) {
            if (p.isThirsty()) {
                numberOfThirsty++;
            }
        }
        int waterPerPlant = (int)((double)amount/numberOfThirsty);
        for (Plant p : this) {
            if (p.isThirsty()) {
                p.water(waterPerPlant);
            }
        }
        return "watering with "+amount;
    }

    @Override
    public String toString() {
                String result = "";
                for (Plant p: this) {
                    result += p.toString() + "\n";

        }
        return result;
    }
}
