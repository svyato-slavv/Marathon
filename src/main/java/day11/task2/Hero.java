package day11.task2;

public abstract class Hero {
    private int health=100;
    private int physDef;
    private int magicDef;
    private int magicAtt;
    private int physAtt;

    public Hero( int physDef,int magicDef, int magicAtt, int physAtt) {
        this.physDef = physDef;
        this.magicAtt = magicAtt;
        this.physAtt = physAtt;
        this.magicDef=magicDef;
    }

    public  void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public int getPhysAtt() {
        return physAtt;
    }
}
