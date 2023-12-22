public class Main {
    public static void main(String[] args) {
        Fighter A = new Fighter("A", 10, 100, 90, 30);
        Fighter B = new Fighter("B", 15, 95, 100, 40);

        Match M = new Match(A, B,90,100);
        M.run();

    }
}