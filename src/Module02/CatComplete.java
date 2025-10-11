package Module02;

public class CatComplete {
    private String name;
    private int age;

    public CatComplete() {}

    public CatComplete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getPets(int number) {
        System.out.printf("%s accepts %d pets.", this.name, number);
    }

    public static void getPets(CatComplete cat, int number) {
        System.out.printf("%s accepts %d pets.", cat.name, number);
    }

    public boolean isNameGood() {
        return (this.name == null ? false : !this.name.toLowerCase().equals("pearl"));
    }

    public static boolean isNameGood(CatComplete c) {
        return (c.name == null ? false : !c.name.toLowerCase().equals("pearl"));
    }

    public static boolean isNameGood(String name) {
        return (name == null ? false : !name.toLowerCase().equals("pearl"));
    }
}