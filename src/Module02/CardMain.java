package Module02;

public class CardMain {
    public static void main(String[] args) {
        Card a = new Card("♦️s", Card.ACE);
        Card b = new Card("♦️s", Card.ACE);
        Card c = new Card("♠️s", Card.ACE);
        Card d = a;

        System.out.println(a == a);
        System.out.println(a == b);
        System.out.println(a == d);

        System.out.println(a.equals(a));
        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
    }
}
