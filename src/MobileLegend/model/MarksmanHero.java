package MobileLegend.model;

public class MarksmanHero extends Hero {
    public MarksmanHero(String name, Integer hp, Integer sp, Integer baseDamage, Integer attackSpeed) {
        super(name, hp, sp, baseDamage, attackSpeed);
        this.baseDamage += baseDamage;
    }

    public void specialAbility() {
        System.out.printf("%s uses canon ball!%n", name);
    }
}
