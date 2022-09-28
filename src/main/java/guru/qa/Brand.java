package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class Brand {
    Set<String> inStockBrands = new HashSet<>();

    void addNewBrand(String clothes){
        inStockBrands.add(clothes);
    }

    void removePosition(String clothes){
        inStockBrands.remove(clothes);
    }


    void searchForBrand(String brand) {
        if (inStockBrands.contains(brand)) {
            System.out.println(brand + " is in stock");
        } else {
            System.out.println(brand + " isn't in our stock");

        }
    }
    void printAllBrands() {
        for (String inStockBrand : inStockBrands) {
            System.out.println("Existing Brand:" + inStockBrand);
        }
    }

}
