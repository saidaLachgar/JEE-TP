package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter

@AllArgsConstructor
@Entity(name = "TClients")
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    public String name;

    @Transient
    public double amount;

    public Client() {}

    public Client(String name) {
        // this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
