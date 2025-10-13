package Module04;

public class InheritanceMain {
    public static void main(String[] args) {
        // Up Cast
        SuperHero otherHero = new SecretHero("iron man", "intelligence", "tony");

        // Down Cast
        SecretHero sameHero = (SecretHero) otherHero;

        SecretHero hero;
        hero = new SecretHero("Sailor Moon", "transformation", "Tsukino");

        System.out.println(hero.getName());
        System.out.println(((SuperHero) hero).getName());
        System.out.println(hero.getPower());

        hero.doAction();

        // Up Cast and then call
        ((SuperHero) hero).doAction();
        hero.doAction();

        hero.doSuperAction();

        hero.doActionAsHero();
    }
}
