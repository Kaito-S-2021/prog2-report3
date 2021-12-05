package jp.ac.uryukyu.ie.e215727;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    void attackTest(){
        int defaultattack = 20;
        Warrior warrior = new Warrior("戦士", 100, defaultattack);
        Enemy enemy = new Enemy("スライム", 100, 3);

        for(int turn = 0; turn < 3; turn++){
            int Hp = enemy.hitPoint;
            warrior.attackWithWeponSkill(enemy);
            assertEquals(defaultattack*1.5, Hp - enemy.hitPoint);
            
        }

    }
}
