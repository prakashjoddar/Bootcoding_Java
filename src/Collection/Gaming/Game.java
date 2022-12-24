package Collection.Gaming;

import java.util.ArrayList;

public class Game {
    int id;
    String name;
    GameDesc gameDescription;

    public Game(int id, String name, GameDesc gameDescription) {
        this.id = id;
        this.name = name;
        this.gameDescription = gameDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameDesc getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(GameDesc gameDescription) {
        this.gameDescription = gameDescription;
    }
}
