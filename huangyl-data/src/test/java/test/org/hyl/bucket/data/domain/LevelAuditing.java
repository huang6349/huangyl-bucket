package test.org.hyl.bucket.data.domain;

import org.hyl.bucket.data.auditing.level.domain.AbstractLevelAuditingEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TB_LEVEL_AUDITING")
public class LevelAuditing extends AbstractLevelAuditingEntity {

    private static final long serialVersionUID = 7282419815915794030L;

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
        return "LevelAuditing{" +
                "name='" + name + '\'' +
                '}';
    }
}
