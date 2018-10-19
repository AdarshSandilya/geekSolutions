package gameproblems;

public class Game {

    private static Fighter firstAttacker;
    private static Fighter secondAttacker;

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttackerName) {
        if (fighter1.name.equals(firstAttackerName)) {
            firstAttacker = fighter1;
            secondAttacker = fighter2;
        } else {
            firstAttacker = fighter2;
            secondAttacker = fighter1;
        }
        firstAttacker.attackOn(secondAttacker);
        if (secondAttacker.health <= 0)
            return firstAttacker.name;
        return declareWinner(secondAttacker, firstAttacker, secondAttacker.name);
    }

    private static void attack (){
        secondAttacker.health = secondAttacker.health - firstAttacker.damagePerAttack;
    }
}
