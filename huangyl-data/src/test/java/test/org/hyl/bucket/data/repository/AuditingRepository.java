package test.org.hyl.bucket.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import test.org.hyl.bucket.data.domain.Auditing;

public interface AuditingRepository extends JpaRepository<Auditing, Long>, JpaSpecificationExecutor<Auditing> {
}
