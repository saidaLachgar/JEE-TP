package cigma.pfe.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String amount;
    private String description;

    @ManyToOne Client client;

    public Facture(){}

    public Facture(String amount, String description, Client client) {
        this.amount = amount;
        this.description = description;
        this.client = client;
    }

    public String getAmount() {
        return amount;
    }
}