package day11.task2;

public class Warrior extends Hero implements PhisAttack {


    public Warrior(int physDef, int magicDef, int magicAtt, int physAtt) {
        super(physDef, magicDef, magicAtt, physAtt);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() > (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100)) {
            hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef() / 100));
        }else hero.setHealth(0);
    }

    @Override
    public String toString() {
        return "Warrior health=" + getHealth();
    }
}
