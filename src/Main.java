public class Main {
    public static void main(String[] args) {
        var player1 = new Player(20, 13);
        var monster = new Moster(10,23);

        player1.healthKitUse();

        player1.healthKitUse();

        player1.hit(player1, monster);
        System.out.println();

        monster.hit(monster, player1);
        System.out.println();

        player1.healthKitUse();

    }
}