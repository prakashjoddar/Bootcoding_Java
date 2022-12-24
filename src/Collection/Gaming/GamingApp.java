package Collection.Gaming;

import java.util.ArrayList;
import java.util.Arrays;

public class GamingApp {
    public static void main(String[] args) {
        Description description1 = new Description(120,
                new ArrayList<String>(Arrays.asList("Android", "IOS")));

        Description description2 = new Description(120,
                new ArrayList<String>(Arrays.asList("Android", "Windows")));

        Game game1 = new Game(1, "Apex Legend",
                new GameDesc( new ArrayList<>(Arrays.asList(description1, description2))));

        System.out.println(game1.getGameDescription());

        System.out.println(game1.getId() +" - "+ game1.getName()
                +" - "+ game1.getGameDescription().getDescription().get(0).getSize()
                +"/"+game1.getGameDescription().getDescription().get(0).getPlatform());

    }
}

class GameDesc{
    ArrayList<Description> description;

    public GameDesc(ArrayList<Description> description) {
        this.description = description;
    }

    public ArrayList<Description> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<Description> description) {
        this.description = description;
    }
}