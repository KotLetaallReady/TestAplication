import java.util.Arrays;

public class Dice {
    private int numberOfDice;
    public final int[] valuesOfDice;

    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
        valuesOfDice = new int[numberOfDice];
    }

    public void roleTheCube(int numberOfCubes){
        for(int i = 0; i< this.numberOfDice; i++){
            valuesOfDice[i] = (int) (Math.random() * 6) + 1;
        }
        System.out.println("All values of dice" + Arrays.toString(valuesOfDice));
    }

    public int counterCheckOnSuccessfulAttack(){
        int counter = 0;
        for(int i : valuesOfDice){
            if(i >= 5){
                counter++;
            }
        }
        return counter;
    }
}
