package cigma.pfe.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@Entity
public class CarteFidelio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public CarteFidelio(String code) {
        this.code = code;
    }

    public CarteFidelio(){}
}