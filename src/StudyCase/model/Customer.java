package StudyCase.model;

public class Customer {
    private Integer id;
    private String name;

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(String name) {
        this(null, name);
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toCSV() {
        return String.format("%s,%s", this.id, this.name);
    }

    public static Customer fromCSV(String csv) {
        String[] parts = csv.split(",");
        return new Customer(Integer.parseInt(parts[0]), parts[1]);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
