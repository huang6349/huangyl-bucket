package test.org.hyl.bucket.data.domain;

import org.hyl.bucket.data.auditing.domain.AbstractIdAuditingEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ID_AUDITING")
public class IdAuditing extends AbstractIdAuditingEntity {

    private static final long serialVersionUID = -283120714981937716L;

    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IdAuditing{" +
                "name='" + name + '\'' +
                '}';
    }
}
