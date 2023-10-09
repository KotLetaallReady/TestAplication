public class Main {
    public static void main(String[] args) {
        var player1 = new Player(20, 13);
        var player2 = new Player(10,23);

        player1.healthKitUse();

        player1.healthKitUse();

        player1.hit(player1, player2);
        System.out.println();

        player2.healthKitUse();
        System.out.println();

        player2.hit(player2, player1);
        System.out.println();

        player1.healthKitUse();

    }
}