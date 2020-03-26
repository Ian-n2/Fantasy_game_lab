package weapons;

import actions.IWeapon;
import enemies.Enemy;

public class Clubs extends Weapon implements IWeapon {

    public Clubs(int damageValue){
        super(damageValue);
    }

    //methods
    public void attack(Enemy enemy)
    {
        int hp = enemy.getHealthPoints();
        int result = hp - 2;
        enemy.setHealthPoints(result);

    }
}
