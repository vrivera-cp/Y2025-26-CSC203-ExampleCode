package Module02;

public class StaticInstanceMain {
    public static void main(String[] args) {
        CatComplete harvest = new CatComplete("Harvest", 4);

        harvest.getPets(100);
        CatComplete.getPets(harvest, 100);

        CatComplete pearl = new CatComplete("Pearl", 3);

        System.out.println(pearl.isNameGood());
        System.out.println(CatComplete.isNameGood(pearl));
        System.out.println(CatComplete.isNameGood("Pearl"));
    }
}
