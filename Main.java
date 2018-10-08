import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //TRIAL 1 IS WHERE THE INTELLIGENCE VALUE WILL BE TESTED

        //Intelligence value for Trial 1 (found that 21 achieves desired conditions through repeated tests and alterations)
        int intel1= 21;

        //Damage value for Trial 1
        // Multiply by 5 because Magic Missile causes damage to the target HP totaling 5 points times the level of intelligence of the caster
        int dam1= intel1*5;

        //Create random number generator
        Random rand= new Random();

        //Create random agility & strength values that are at least 10
        //Sum of agility, strength, and intelligence cannot equal more than 50
        int agil= rand.nextInt(10)+10;
        int strength= 50-(intel1+agil);

        //Determine actual damage for each of the 10 turns in Trial 1 with multipliers
        //The multiplier is a random number between 0.5 and 1.5. Use random number generator and add 0.5 to achieve this range
        double multiplier1= rand.nextDouble()+.5;
        double damage1= dam1*multiplier1;

        double multiplier2= rand.nextDouble()+.5;
        double damage2= dam1*multiplier2;

        double multiplier3= rand.nextDouble()+.5;
        double damage3= dam1*multiplier3;

        double multiplier4= rand.nextDouble()+.5;
        double damage4= dam1*multiplier4;

        double multiplier5= rand.nextDouble()+.5;
        double damage5= dam1*multiplier5;

        double multiplier6= rand.nextDouble()+.5;
        double damage6= dam1*multiplier6;

        double multiplier7= rand.nextDouble()+.5;
        double damage7= dam1*multiplier7;

        double multiplier8= rand.nextDouble()+.5;
        double damage8= dam1*multiplier8;

        double multiplier9= rand.nextDouble()+.5;
        double damage9= dam1*multiplier9;

        double multiplier10= rand.nextDouble()+.5;
        double damage10= dam1*multiplier10;

        //Total damage to the orc for the 10 turns of Trial 1 based on random multipliers between 0.5 and 1.5
        //This value needs to equal at least 1,000 60-70% of the time for the game to run effectively. This will be charted in a table
        int totalDamageToOrc=(int)(damage1+damage2+damage3+damage4+damage5+damage6+damage7+damage8+damage9+damage10);
        System.out.println("The total damage to the orc is " + totalDamageToOrc + ".");


        //TRIAL 2 IS WHERE THE BASE NUMBER OF THE MAGIC MISSILE DAMAGE WILL BE TESTED

        //Intelligence value for Trial 2 (must be set at 10)
        int intel2=10;

        //Damage value for Trial 2 with an intelligence value of 10
        //Base number has been set at 10.43 instead of 5 to achieve desired conditions. 10.43 was found through repeated tests and alterations
        double dam2=intel2*10.43;

        //Determine actual damage for each of the 10 turns in Trial 2 with random multipliers
        //The multiplier is a random number between 0.5 and 1.5. Use random number generator and add 0.5 to achieve this range
        double multiplier11= rand.nextDouble()+.5;
        double damage11= dam2*multiplier11;

        double multiplier12= rand.nextDouble()+.5;
        double damage12= dam2*multiplier12;

        double multiplier13= rand.nextDouble()+.5;
        double damage13= dam2*multiplier13;

        double multiplier14= rand.nextDouble()+.5;
        double damage14= dam2*multiplier14;

        double multiplier15= rand.nextDouble()+.5;
        double damage15= dam2*multiplier15;

        double multiplier16= rand.nextDouble()+.5;
        double damage16= dam2*multiplier16;

        double multiplier17= rand.nextDouble()+.5;
        double damage17= dam2*multiplier17;

        double multiplier18= rand.nextDouble()+.5;
        double damage18= dam2*multiplier18;

        double multiplier19= rand.nextDouble()+.5;
        double damage19= dam2*multiplier19;

        double multiplier20= rand.nextDouble()+.5;
        double damage20= dam2*multiplier20;

        //Total damage to the orc for Trial 2 (where intelligence value is set at a value of 10 and base number is chosen to be 10.43)
        //This value must equal at least 1,000 60-70% of the time for the game to run effectively. This will be charted in a table
        int totalDamageToOrc2= (int)(damage11+damage12+damage13+damage14+damage15+damage16+damage17+damage18+damage19+damage20);
        System.out.println("The total damage to the orc is " + totalDamageToOrc2 + ".");
    }
}