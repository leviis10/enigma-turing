package MobileLegend.model;

public class AssassinHero extends Hero {
    public AssassinHero(String name, Integer hp, Integer sp, Integer baseDamage, Integer attackSpeed) {
        super(name, hp, sp, baseDamage, attackSpeed);
        this.attackSpeed += attackSpeed;
    }

    public void specialAbility() {
        System.out.printf("%s uses stealth attack!%n", name);
    }
}
