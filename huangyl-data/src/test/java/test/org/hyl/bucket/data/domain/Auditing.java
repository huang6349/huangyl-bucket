package test.org.hyl.bucket.data.domain;

import org.hyl.bucket.data.auditing.domain.AbstractAuditingEntity;

import javax.persistence.*;

@Entity
@Table(name = "TB_AUDITING")
public class Auditing extends AbstractAuditingEntity {

    private static final long serialVersionUID = 4512016764856111103L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auditing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
