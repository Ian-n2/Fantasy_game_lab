package Spells;

import actions.ISpell;

public abstract class Spell implements ISpell {

    protected int damageValue;

    public Spell(int damageValue){
        this.damageValue = damageValue;
    }

    public int getDamage() {
        return damageValue;
    }

    public void setDamage(int damageValue) {
        this.damageValue = damageValue;
    }
}
