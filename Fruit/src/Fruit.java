public class Fruit implements Comparable<Fruit> {
    private String name;
    private double weight;
    private double sugarContent;

    public Fruit(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public int compareTo(Fruit other) {
        int weightComparison = Double.compare(this.weight, other.weight);
        if (weightComparison != 0) {
            return weightComparison;
        }
        return Double.compare(this.sugarContent, other.sugarContent);
    }

    @Override
    public String toString() {
        return name + " (Weight: " + weight + ", Sugar: " + sugarContent + ")";
    }
}
