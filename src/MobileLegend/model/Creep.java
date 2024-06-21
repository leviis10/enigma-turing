package MobileLegend.model;

public abstract class Creep {
    private String name;
    private Integer hp;
    private Integer damage;

    protected Creep(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void attack(Hero target) {
        target.getHit(this);
    }

    public void getHit(Hero hero) {
        this.hp -= hero.baseDamage;
        System.out.printf("%s attack %s with %d damage. HERO HP: %d, CREEP HP: %d%n", hero.name, this.name, hero.baseDamage, hero.hp, this.hp);
        if (this.hp <= 0) {
            System.out.printf("%s is dead%n", this.name);
            return;
        }
        this.attack(hero);
    }

    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public String printStat() {
        return "Creep{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
