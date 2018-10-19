package gameproblems;

public class Fighter {
    final String name;
    public int health;
    final int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attackOn(Fighter otherFighter) {
        otherFighter.health = otherFighter.health - damagePerAttack;
    }
}
