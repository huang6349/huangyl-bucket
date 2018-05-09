package test.org.hyl.bucket.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import test.org.hyl.bucket.data.domain.LevelAuditing;

public interface LevelAuditingRepository extends JpaRepository<LevelAuditing, Long>, JpaSpecificationExecutor<LevelAuditing> {
}
