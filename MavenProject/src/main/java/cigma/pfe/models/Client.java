package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
//@Inheritance(strategy = InheritanceType.JOINED)

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="client_type")
//@DiscriminatorValue("client")

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {

    @Id
    // GenerationType.IDENTITY n’est pas permise si
    // La stratégie d'héritage est TABLE_PER_CLASS
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id ;
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "client")
    private List<Facture> factures;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",
            joinColumns = @JoinColumn(name = "client_fk", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn( name = "promotion_fk", referencedColumnName = "id"))
    private List<Promotion> promotions;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;

    public Client() {}

    public Client(String name) {
        this.name = name;
    }
}