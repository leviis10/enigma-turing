import MobileLegend.model.*;

public class Main {
    public static void main(String[] args) {
        // LAND OF DAWN
        System.out.println("Game begin!");

        // team 1
        AssassinHero assassin1 = new AssassinHero("LingLung", 300, 100, 500, 400);
        print(assassin1);

        // team 2
        TankHero tank2 = new TankHero("Tigril", 500, 100, 100, 50);
        print(tank2);

        // action
        assassin1.attack(tank2);
        print(tank2);

        assassin1.attack(tank2);

        // ASSIGNMENT
        System.out.println("=".repeat(20));
        // HEAL
        System.out.println("HEAL FEATURE");
        MageHero rafaela = new MageHero("Rafaela", 100, 100, 100, 100);
        TankHero gloo = new TankHero("Gloo", 100, 100, 100, 100);
        print(gloo);
        print(rafaela);
        rafaela.heal(gloo, 10);
        print(gloo);
        rafaela.heal(gloo, 500);
        print(gloo);

        System.out.println("=".repeat(20));
        // Creep Attack
        System.out.println("Creep attack");
        Hero atlas = new TankHero("Atlas", 500, 250, 25, 10);
        Creep jungleMonster = new JungleMonster();

        print(atlas);
        print(jungleMonster);

        atlas.attack(jungleMonster);
    }

    public static void print(Hero hero) {
        System.out.println(hero.printHeroStat());
    }

    public static void print(Creep creep) {
        System.out.println(creep.printStat());
    }
}
