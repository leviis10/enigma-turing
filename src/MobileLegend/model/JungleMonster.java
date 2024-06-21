package MobileLegend.model;

public class JungleMonster extends Creep {
    public JungleMonster(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    public JungleMonster() {
        super("Jungle Monster", 50, 25);
    }
}
