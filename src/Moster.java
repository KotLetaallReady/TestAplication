import java.util.Scanner;

public class Moster extends Entity{
    public Moster(int defense, int attack){

        Scanner scan = new Scanner(System.in);

        this.defense = defense;
        this.attack = attack;

        System.out.println("Enter minimal damage: ");
        damageMin = scan.nextInt();
        System.out.println("Enter maximum damage: ");
        damageMax = scan.nextInt();
        System.out.println("Health = " + damageMax * 4);
        health = damageMax * 4;
        maxHealth = health;
    }

    @Override
    public void die(){
        System.out.println("Moster is die");
    }
}
