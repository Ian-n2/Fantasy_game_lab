package weapons;

import actions.IWeapon;
import enemies.Enemy;

public class Fist extends Weapon implements IWeapon {
    public Fist(int damageValue){
            super(damageValue);
        }

        //methods
        public void attack(Enemy enemy)
        { int hp = enemy.getHealthPoints();
            int result = hp - damageValue;
            enemy.setHealthPoints(result);
        }
}
