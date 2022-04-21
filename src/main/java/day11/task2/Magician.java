package day11.task2;

public class Magician extends Hero implements PhisAttack, MagicAttack {


    public Magician(int physDef, int magicDef, int magicAtt, int physAtt) {
        super(physDef, magicDef, magicAtt, physAtt);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() > (getMagicAtt() - getMagicAtt() * hero.getMagicDef() / 100)) {
            hero.setHealth(hero.getHealth() - (getMagicAtt() - getMagicAtt() * hero.getMagicDef() / 100));
        } else hero.setHealth(0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() > (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100)) {
            hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100));
        } else hero.setHealth(0);
    }

    @Override
    public String toString() {
        return "Magician health=" + getHealth();
    }
}
