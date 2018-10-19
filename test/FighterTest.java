import gameproblems.Fighter;
import org.junit.Test;

import static org.junit.Assert.*;

public class FighterTest {
    @Test
    public void should_reduce_other_player_health_by_first_plyaer_damage_per_attack (){
        Fighter firstFighter = new Fighter("Lew", 10, 2);
        Fighter secondFighter = new Fighter("Harry", 5, 4);

        firstFighter.attackOn(secondFighter);
        assertEquals(secondFighter.health, 3);

        secondFighter.attackOn(firstFighter);
        assertEquals(firstFighter.health, 6);
    }
}
