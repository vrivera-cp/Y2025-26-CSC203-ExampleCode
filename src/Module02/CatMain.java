package Module02;

public class CatMain {
    public static void main(String[] args) {
        // Initial Object
        Cat mochi = new Cat("Mochi", 7);

        // toString()
        System.out.println(mochi.toString());
        System.out.println("Cat: " + mochi);

        // equals()
        System.out.println(mochi.equals(mochi));

        Cat harvest = new Cat("Harvest", 6);
        System.out.println(mochi.equals(harvest));

        Cat copycat = new Cat("Mochi", 7);
        System.out.println(mochi.equals(copycat));

        // Hashcode
        System.out.println(mochi.hashCode());
        System.out.println(harvest.hashCode());
        System.out.println(copycat.hashCode());
    }
}
