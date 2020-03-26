import Spells.Fire;
import Spells.Hands;
import Spells.Lighting;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Fighter;
import players.Knight;
import players.Wizard;
import weapons.Axe;
import weapons.Fist;
import weapons.Sword;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class FighterTest {

   Knight knight;
    Orc orc;
    Axe axe;
    Sword sword;
    Wizard wizard;
    Fire fire;
    Lighting lighting;
    Fist fist;
    Hands hands;


    @Before
    public void before(){
        knight = new Knight("Jan", 12, null);
        axe = new Axe(5);
        orc = new Orc(10, 4);
        sword =new Sword(7);
        wizard = new Wizard("Ian", 7, null);
        fire = new Fire(7);
        lighting = new Lighting(9);
        fist = new Fist(1);
        hands = new Hands(0);
        knight.switchWeapon(axe);
        wizard.switchSpell(fire);

    }

    @Test
    public void checkOrcHp(){
        assertEquals(10, orc.getHealthPoints());
    }
    @Test
    public void canHitOrc(){
        axe.attack(orc);
        assertEquals(5,orc.getHealthPoints());
    }
    @Test
    public void canSwitch(){
        knight.switchWeapon(sword);
        knight.canAttack(sword,orc);
        assertEquals(3,orc.getHealthPoints());
        assertEquals(sword, knight.getHeldItem());
    }
    @Test
    public void canCheckheldItem(){
        assertEquals(axe,knight.getHeldItem());
    }

    @Test
    public void CanHitWithSword(){
        knight.canAttack(sword,orc);
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void seeDamage(){
        assertEquals(7,fire.getDamage());
    }
    @Test
    public void checkHeldSpell(){
        assertEquals(fire, wizard.getHeldSpell());
    }

    @Test
    public void CanCastFire(){
        wizard.switchSpell(fire);
        wizard.canAttack(fire,orc);
        assertEquals(3, orc.getHealthPoints());
    }

}
