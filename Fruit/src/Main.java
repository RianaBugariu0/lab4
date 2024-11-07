import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>(List.of(
                new Fruit("Apple", 150, 12),
                new Fruit("Banana", 120, 18),
                new Fruit("Mango", 200, 25),
                new Fruit("Grapes", 50, 16)
        ));

        List<Vegetable> vegetables = new ArrayList<>(List.of(
                new Vegetable("Carrot", 80),
                new Vegetable("Potato", 120),
                new Vegetable("Tomato", 90)
        ));


        sortFruitsByWeight(fruits);


        Map<String, List<Fruit>> sugarGroups = groupFruitsBySugarContent(fruits);
        System.out.println("Grouped fruits by sugar content: " + sugarGroups);


        sortVegetablesByWeight(vegetables);
    }


    public static void sortFruitsByWeight(List<Fruit> fruits) {
        Collections.sort(fruits);
        System.out.println("Fruits sorted by weight (and sugar content if weight is the same): " + fruits);
    }


    public static Map<String, List<Fruit>> groupFruitsBySugarContent(List<Fruit> fruits) {
        return fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.getSugarContent() > 20 ? "High Sugar" : "Low Sugar"));
    }


    public static void sortVegetablesByWeight(List<Vegetable> vegetables) {
        Collections.sort(vegetables);
        System.out.println("Vegetables sorted by weight: " + vegetables);
    }
}
