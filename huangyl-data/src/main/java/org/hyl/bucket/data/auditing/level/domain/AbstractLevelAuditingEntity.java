package org.hyl.bucket.data.auditing.level.domain;

import org.hyl.bucket.data.auditing.domain.AbstractIdAuditingEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractLevelAuditingEntity extends AbstractIdAuditingEntity {

    private static final long serialVersionUID = -6288033231508159953L;

    @Column(name = "P_ID", nullable = false, columnDefinition = "BIGINT DEFAULT 0")
    private Long pid = 0L;

    @Column(name = "LEVEL", nullable = false)
    private String level;

    @Column(name = "SEQ", nullable = false, columnDefinition = "INTEGER DEFAULT 0")
    private Integer seq = 0;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}
