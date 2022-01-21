package cigma.pfe.models;


import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity(name = "TProduit")

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private  String name ;
    private  double price ;

    public Produit() {
    }

    public Produit(String name, double price) {
        this.name = name;
        this.price = price;
    }
}