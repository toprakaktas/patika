package Boxing;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tyler Durden", 15, 100, 100, 25);
        Fighter f2 = new Fighter("Joe Narrator", 25, 75, 90, 35);

        Match match = new Match(f1, f2, 75,100);
        match.run();
    }
}
