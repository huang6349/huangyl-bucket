package org.hyl.bucket.data.auditing.domain;

import javax.persistence.*;

@MappedSuperclass
public class AbstractIdAuditingEntity extends AbstractAuditingEntity {

    private static final long serialVersionUID = 1662314053131488048L;

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
