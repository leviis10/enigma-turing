package MobileLegend.model;

public class MageHero extends Hero {
    public MageHero(String name, Integer hp, Integer sp, Integer baseDamage, Integer attackSpeed) {
        super(name, hp, sp, baseDamage, attackSpeed);
        this.sp += 100;
    }

    public void specialAbility() {
        System.out.printf("%s uses fireball!%n", name);
    }

    // 1 heal feature
    public void heal(Hero targetHeal, Integer spUsage) {
        if (this.sp - spUsage < 0) {
            System.out.println("Not enough SP");
            return;
        }
        this.sp -= spUsage;
        int healAmount = spUsage * 5; // heal adalah 5 kali spUsage
        targetHeal.hp += healAmount;
        System.out.printf("%s heal %s with %d hp%n", this.name, targetHeal.name, healAmount);
    }

    // 2 abstract class untuk creep (name, hp, damage) extend ke jungle monster, method attack hero if got attacked


    // 3 if hero hit monster, monster pake hero sampai salah 1 mati
}
