package weapons;

import actions.IWeapon;
import enemies.Enemy;

public class Sword extends Weapon implements IWeapon {

    public Sword(int damageValue){
        super(damageValue);
    }


    //methods
    public void attack(Enemy enemy)
    {
        int hp = enemy.getHealthPoints();
        int result = hp - 7;
        enemy.setHealthPoints(result);

    }
}
