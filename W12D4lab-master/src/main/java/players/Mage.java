package players;

import Spells.Hands;
import Spells.Spell;
import enemies.Enemy;
import weapons.Fist;
import weapons.Weapon;

import java.util.ArrayList;

public abstract class Mage extends Player {
    private ArrayList<Spell> allSpells;
    protected Spell heldSpell;

    public Mage(String name, int healthPoints, Spell heldSpell) {
        super(name, healthPoints);
        this.allSpells = new ArrayList<Spell>();
        this.heldSpell = null;

    }


    //methods
    public void addSpellToList(Spell spell) {
        allSpells.add(spell);
    }

    public void switchSpell(Spell spell) {
        this.heldSpell = (spell);
    }

    public Spell getHeldSpell() {
        return this.heldSpell;
    }

    public void canAttack(Spell spell, Enemy enemy){
        if( this.heldSpell == spell){
            spell.cast(enemy);
        }
    }

}
