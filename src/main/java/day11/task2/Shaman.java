package day11.task2;

public class Shaman extends Hero implements PhisAttack, MagicAttack, Healer {


    public Shaman(int physDef, int magicDef, int magicAtt, int physAtt) {
        super(physDef, magicDef, magicAtt, physAtt);
    }

    @Override
    public void healHimself() {
        for (int i = 0; i <50 ; i++){
            if (getHealth() < 100) {
                setHealth(getHealth() + 1);
            }else setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        for (int i = 0; i < 30; i++) {
            if (hero.getHealth()<100){
                hero.setHealth(hero.getHealth()+1);
            }else hero.setHealth(100);
        }

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
        return "Shaman health=" + getHealth();
    }
}
