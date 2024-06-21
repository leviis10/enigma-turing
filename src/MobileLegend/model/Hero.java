package MobileLegend.model;

public abstract class Hero {
    public String name;
    public Integer hp;
    public Integer sp;
    public Integer baseDamage;
    public Integer attackSpeed;

    protected Hero(String name, Integer hp, Integer sp, Integer baseDamage, Integer attackSpeed) {
        this.name = name;
        this.hp = hp;
        this.sp = sp;
        this.baseDamage = baseDamage;
        this.attackSpeed = attackSpeed;
    }

    public void attack(Hero hero) {
        System.out.printf("%s attack %s with %d damage%n", name, hero.name, baseDamage);
        hero.getHit(baseDamage);
        if (hero.hp <= 0) {
            recall2(this, 5);
        }
    }

    public void getHit(Integer damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.printf("%s has been slain%n", name);
        } else if (hp <= 100) {
            System.out.printf("%s Said: I NEED HEAL PLEASE!%n", name);
        }
    }

    public void recall2(Hero hero, Integer num) {
        System.out.println(String.format("%s do TAS TAS TAS%n", hero.name).repeat(num));
    }

    // ----------------- ASSIGNMENT----------------------------
    public void attack(Creep creep) {
        creep.getHit(this);
    }

    public void getHit(Creep creep) {
        this.hp -= creep.getDamage();
        System.out.printf("%s attack %s with %d damage. HERO HP: %d, CREEP HP: %d%n", creep.getName(), this.name, creep.getDamage(), this.hp, creep.getHp());
        if (this.hp <= 0) {
            System.out.printf("%s is dead%n", this.name);
            return;
        }
        this.attack(creep);
    }

    public String printHeroStat() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", sp=" + sp +
                ", baseDamage=" + baseDamage +
                ", attackSpeed=" + attackSpeed +
                '}';
    }
}
