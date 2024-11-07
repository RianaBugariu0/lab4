public class Vegetable implements Comparable<Vegetable> {
    private String name;
    private double weight;

    public Vegetable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Vegetable other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + " (Weight: " + weight + ")";
    }
}


