/**
 * Created by Viktor on 2016.12.12..
 */
public class F35 extends AirCraft {

    public F35(){
        this.typID="F35";
        this.maxAmmo=10;
    }

    @Override
    public String toString() {
        return "Type "+this.typID+ "Ammo "+this.actAmmo+ "Damage "+this.damage+ "All Damage "+this.fight();
    }
}
