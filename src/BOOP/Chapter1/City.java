package BOOP.Chapter1;

public class City extends Location{
    @Override
    public void pingpoint() {
        System.out.println("kota ini ada di ");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
