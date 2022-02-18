package cigma.pfe.models;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompanyId implements Serializable {

    /*@EmbeddedId
    private CompanyId id;*/
    private long rc;
    private long idTribunal;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyId companyId = (CompanyId) o;
        return rc == companyId.rc && idTribunal == companyId.idTribunal;
    }
    @Override
    public int hashCode() {
        return Objects.hash(rc, idTribunal);
    }
}
