class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println(first.getClass().getSimpleName() + " (" + first + ") & " +
                           second.getClass().getSimpleName() + " (" + second + ")");
    }

    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }
}

public class MainHandsOn4 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "Satu");
        System.out.print("Sebelum swap: ");
        pair1.showTypes();
        Pair<String, Integer> swapped1 = pair1.swap();
        System.out.print("Sesudah swap: ");
        swapped1.showTypes();

        System.out.println();

        Pair<Double, Boolean> pair2 = new Pair<>(99.5, true);
        System.out.print("Sebelum swap: ");
        pair2.showTypes();
        Pair<Boolean, Double> swapped2 = pair2.swap();
        System.out.print("Sesudah swap: ");
        swapped2.showTypes();
    }
}