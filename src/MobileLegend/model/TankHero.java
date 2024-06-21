package MobileLegend.model;

public class TankHero extends Hero {
    public TankHero(String name, Integer hp, Integer sp, Integer baseDamage, Integer attackSpeed) {
        super(name, hp, sp, baseDamage, attackSpeed);
        this.hp += 100;
    }

    public void specialAbility() {
        System.out.printf("%s uses shield!%n", name);
    }
}
