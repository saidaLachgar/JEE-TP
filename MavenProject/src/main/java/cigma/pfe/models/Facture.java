package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor


@Entity(name = "TFactures")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long id;
    private String description;
    private double amount;

    @ManyToOne()
    @JoinColumn(name = "Client_id")
    private Client client;

    @ManyToMany(cascade ={CascadeType.PERSIST})
    @JoinTable(name = "my_join_table_Facture_Produit",joinColumns = @JoinColumn(name = "Facture_fk",referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn(name="Produit_fk",referencedColumnName="id"))
    private List<Produit> produits;


    public Facture(){}

    public Facture( double amount,String description) {

        this.amount = amount;
        this.description = description;
    }

}