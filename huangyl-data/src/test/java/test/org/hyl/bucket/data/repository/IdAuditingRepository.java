package test.org.hyl.bucket.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import test.org.hyl.bucket.data.domain.IdAuditing;

public interface IdAuditingRepository extends JpaRepository<IdAuditing, Long>, JpaSpecificationExecutor<IdAuditing> {
}
