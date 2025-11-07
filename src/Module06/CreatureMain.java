package Module06;

import java.util.Comparator;
import java.util.*;

public class CreatureMain {
    public static void main() {
        Creature c1 = new Creature("Bulbasaur");
        Creature c2 = new Creature("Charmander");
        Creature c3 = new Creature("Squirtle");

        Map<Creature, List<String>> types = new HashMap<>();
        Map<Creature, Integer> hps = new HashMap<>();

        // Creature 1
        hps.put(c1, 45);
        types.put(c1, List.of("Grass", "Poison"));

        // Creature 2
        hps.put(c2, 39);
        types.put(c2, List.of("Fire"));

        // Creature 3
        hps.put(c3, 44);
        types.put(c3, List.of("Water"));

        // Map Operations
        System.out.println(hps.get(c1));
        System.out.println(hps.get(new Creature("Charmander")));

        // Create a List of the Creatures
        List<Creature> creatures = new ArrayList<>(List.of(c1, c2, c3));

        // List operations
        System.out.println(creatures.contains(c3));
        System.out.println(creatures.contains(new Creature("Squirtle")));
        System.out.println(creatures.contains(new Creature("Pikachu")));

        System.out.println(creatures);
        creatures.sort(
                Comparator.comparing(Creature::getName)
                        .reversed()
        );
        System.out.println(creatures);

        // Sorting a list using map values
        creatures.sort(
                Comparator.comparingInt(
                        c -> hps.get(c)
                )
        );
        creatures.forEach(
                c -> System.out.printf("%16s\t%d%n", c.getName(), hps.get(c))
        );

        // The Map's getOrDefault Method
        Creature c4 = new Creature("Mewtwo");
        creatures.add(c4);
        creatures.sort(
                Comparator.comparingInt(
                        c -> types.getOrDefault(c, List.of()).size()
                )
                        .reversed()
        );
        creatures.forEach(
                c -> System.out.printf("%16s\t%s%n", c.getName(), types.getOrDefault(c, List.of()))
        );

        // Erroneous Usage Example
        hps.put(c4, 110);
        types.put(c4, List.of("Psychic"));
        creatures.forEach(
                c -> System.out.printf("%16s\t%-24s\t%d%n", c.getName(), types.get(c), hps.get(c))
        );

        Creature c5 = new Creature("Mewtwo");
        creatures.add(c5);

        hps.put(c5, 190);
        types.put(c5, List.of("Psychic", "Fighting"));
        creatures.forEach(
                c -> System.out.printf("%16s\t%-24s\t%d%n", c.getName(), types.get(c), hps.get(c))
        );
    }
}
