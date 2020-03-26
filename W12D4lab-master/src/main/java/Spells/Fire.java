package Spells;

import actions.ISpell;
import actions.IWeapon;
import enemies.Enemy;
import weapons.Weapon;

public class Fire extends Spell{

    public Fire(int damageValue){
        super(damageValue);
    }

//    methods
    public void cast(Enemy enemy)
    { int hp = enemy.getHealthPoints();
        int result = hp - damageValue;
        enemy.setHealthPoints(result);
    }

}



