

public abstract class Entity {
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int attack;
    protected int health;
    protected int maxHealth;

    protected boolean checkOnDie(Entity mobDefending){
        if(mobDefending.health <= 0){
            die();
            return true;
        }
        return false;
    }
    public void die(){
        System.out.println("Entity is die");
    }

    public void hit(Entity mobAttacked, Entity mobDefending)
    {
        int attackModifier = mobAttacked.attack - mobDefending.defense + 1;
        System.out.println("attackModifier = " + attackModifier);

        Dice dices = new Dice(attackModifier);
        dices.roleTheCube(attackModifier);

        var count = dices.counterCheckOnSuccessfulAttack();

        if(count <= 0) return;

        for(int i=0;i<dices.counterCheckOnSuccessfulAttack();i++)
        {
            int damage = 0;
            damage = dices.valuesOfDice[i];
            mobDefending.health -= damage;
            System.out.println("-" + damage);
            if(checkOnDie(mobDefending))
            {
                break;
            }
        }
    }

}

