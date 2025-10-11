package Module03;

public class TypeCastMain {
    public static void main(String[] args) {
        // Up Casting
        Lion lion = new Lion();
        Carnivore upcasted = (Carnivore) lion;

        // Down Casting
        Herbivore herbivore = new Human(); // Implicit Up Cast
        Human downcasted = (Human) herbivore;
        Tortoise invalid = (Tortoise) herbivore; // Error, not a Tortoise

        // Class Casting (Compilation Error)
        // Human human = (Human) lion;

        // Unrelated Interface Cast
        Tortoise tortoise = new Tortoise();
        Carnivore carnivore = (Carnivore) tortoise;
    }
}
