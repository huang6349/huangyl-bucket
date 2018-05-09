package org.hyl.bucket.data;

import org.assertj.core.api.Assertions;
import org.hyl.bucket.data.auditing.level.LevelUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test.org.hyl.bucket.data.TestApplication;
import test.org.hyl.bucket.data.domain.LevelAuditing;
import test.org.hyl.bucket.data.repository.LevelAuditingRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class LevelAuditingTest {

    private static final String DEFAULT_NAME = "DEFAULT_NAME";
    private static final String UPDATE_NAME = "UPDATE_NAME";
    private static final Long UPDATE_P_ID = 1L;

    @Autowired
    private LevelAuditingRepository repository;

    private LevelAuditing auditing;

    @Before
    public void initTest() {
        auditing = new LevelAuditing();
        auditing.setName(DEFAULT_NAME);
        auditing.setLevel(LevelUtil.calculateLevel(getLevel(auditing.getPid()), auditing.getPid()));
    }

    private String getLevel(Long id) {
        return Optional.of(id).map(repository::findOne).map(LevelAuditing::getLevel).orElse(null);
    }

    @Test
    @Transactional
    public void create() throws Exception {
        int size = repository.findAll().size();
        repository.saveAndFlush(auditing);
        List<LevelAuditing> auditings = repository.findAll();
        Assertions.assertThat(auditings).hasSize(size + 1);
        LevelAuditing test = auditings.get(auditings.size() - 1);
        Assertions.assertThat(test.getId()).isNotNull();
        Assertions.assertThat(test.getName()).isEqualTo(DEFAULT_NAME);
        Assertions.assertThat(test.getPid()).isEqualTo(0L);
        Assertions.assertThat(test.getLevel()).isEqualTo(LevelUtil.ROOT);
        Assertions.assertThat(test.getSeq()).isEqualTo(0);
        Assertions.assertThat(test.getCreatedBy()).isEqualTo("SYSTEM");
        Assertions.assertThat(test.getCreatedDate()).isNotNull();
        Assertions.assertThat(test.getLastModifiedBy()).isEqualTo("SYSTEM");
        Assertions.assertThat(test.getLastModifiedDate()).isNotNull();
    }

    @Test
    @Transactional
    public void update() throws Exception {
        repository.saveAndFlush(auditing);
        int size = repository.findAll().size();
        LevelAuditing update = repository.findOne(auditing.getId());
        update.setName(UPDATE_NAME);
        update.setPid(UPDATE_P_ID);
        update.setLevel(LevelUtil.calculateLevel(getLevel(update.getPid()), update.getPid()));
        repository.saveAndFlush(update);
        List<LevelAuditing> auditings = repository.findAll();
        Assertions.assertThat(auditings).hasSize(size);
        LevelAuditing test = auditings.get(auditings.size() - 1);
        Assertions.assertThat(test.getName()).isEqualTo(UPDATE_NAME);
        Assertions.assertThat(test.getPid()).isEqualTo(UPDATE_P_ID);
        Assertions.assertThat(test.getLevel()).isEqualTo(LevelUtil.calculateLevel(getLevel(test.getPid()), test.getPid()));
        Assertions.assertThat(test.getCreatedDate()).isNotEqualTo(test.getLastModifiedDate());
    }
}
