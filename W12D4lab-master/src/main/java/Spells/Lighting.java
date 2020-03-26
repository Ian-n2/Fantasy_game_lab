package Spells;

import actions.ISpell;
import enemies.Enemy;

public class Lighting extends Spell{

    public Lighting(int damageValue){
        super(damageValue);
    }

    //    methods
    public void cast(Enemy enemy)
    { int hp = enemy.getHealthPoints();
        int result = hp - damageValue;
        enemy.setHealthPoints(result);
    }

}
