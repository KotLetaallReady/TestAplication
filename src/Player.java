import java.util.Scanner;

public class Player extends Entity{
    private int healthKitCounter = 4;

    public Player(int defense, int attack){

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


    public void healthKitUse(){
        health += maxHealth * 0.3;
        healthKitCounter--;
        if(health >= maxHealth){
            health = maxHealth;
        }
        System.out.println("HealthKit used. Health = " + health + ". Remains: " + healthKitCounter);
    }

    @Override
    public void die(){
        System.out.println("Player is die");
    }
}
