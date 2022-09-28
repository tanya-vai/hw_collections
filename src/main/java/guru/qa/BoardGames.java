package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class BoardGames {
    Map<String, Integer> storedBoardGames = new HashMap<>();

    public void addNewBoardGame(String name, Integer price) {
        storedBoardGames.put(name, price);
    }

    public void removeNewBoardGame(String name) {
        storedBoardGames.remove(name);
    }

    public void findPriceOfBoardGame(String name) {
        if (storedBoardGames.containsKey(name)) {
            System.out.println("The price of " + name + " is " + storedBoardGames.get(name));
        } else {
            System.out.println("We don't have " + name);
        }
    }

    public void printAllBoardGames() {
        for (Map.Entry<String, Integer> entry : storedBoardGames.entrySet()) {
            System.out.println("Board game " + entry.getKey() + ", price: " + entry.getValue());
        }
    }

}
