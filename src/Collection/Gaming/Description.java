package Collection.Gaming;

import java.util.ArrayList;

public class Description {
    int size;
    ArrayList<String> platform;

    public Description(int size, ArrayList<String> platform) {
        this.size = size;
        this.platform = platform;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<String> getPlatform() {
        return platform;
    }

    public void setPlatform(ArrayList<String> platform) {
        this.platform = platform;
    }
}
