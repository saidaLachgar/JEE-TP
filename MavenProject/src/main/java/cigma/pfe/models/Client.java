package cigma.pfe.models;

public class Client {

    public long id;
    public String name;

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Client() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
