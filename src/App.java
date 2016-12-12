/**
 * Created by Viktor on 2016.11.21..
 */
public class App {
    public static void main(String[] args) {

        TheGarden theGarden= new TheGarden();
        theGarden.add(new TheFlower("yellow"));
        theGarden.add(new TheFlower("blue"));
        theGarden.add(new TheTree("purple"));
        theGarden.add(new TheTree("orange"));
        System.out.println(theGarden);
        System.out.println(theGarden.water(40));
        System.out.println(theGarden);
        System.out.println(theGarden.water(70));
        System.out.println(theGarden);
    }
}
