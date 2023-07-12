import java.util.ArrayList;

public class Location {
    private String description;
    private ArrayList<Location> connectedLocations;
    private ArrayList<Character> characters;
    private ArrayList<Item> items;
    // Add additional location properties and methods here
    
    public Location(String description) {
        this.description = description;
        connectedLocations = new ArrayList<>();
        characters = new ArrayList<>();
        items = new ArrayList<>();
    }
    
    // Add methods to connect locations, add characters/items, etc.
}

