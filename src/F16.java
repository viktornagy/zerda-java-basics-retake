/**
 * Created by Viktor on 2016.12.12..
 */
public class F16 extends AirCraft {

    public F16(){
        this.typID="F16";
    }

    @Override
    public String toString() {
        return "Type "+this.typID+ "Ammo "+this.actAmmo+ "Damage "+this.damage+ "All Damage "+this.fight();
    }


}
