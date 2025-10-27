package Module05;

import java.util.function.Consumer;

public class Potion {
    public Consumer<PotionDrinker> effect;

    public Potion(Consumer<PotionDrinker> effect) {
        this.effect = effect;
    }
}
