package cigma.pfe.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.PrimaryKeyJoinColumn;

//@PrimaryKeyJoinColumn(name="normal_id")
//@DiscriminatorValue("normal")
public class ClientNormal extends Client{
    private int importanceLevel;
    public ClientNormal(String name, int importanceLevel) {
        super(name);
        this.importanceLevel = importanceLevel;
    }
}
