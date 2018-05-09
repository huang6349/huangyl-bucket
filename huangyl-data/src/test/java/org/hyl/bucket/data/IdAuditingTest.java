package org.hyl.bucket.data;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test.org.hyl.bucket.data.TestApplication;
import test.org.hyl.bucket.data.domain.IdAuditing;
import test.org.hyl.bucket.data.repository.IdAuditingRepository;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class IdAuditingTest {

    private static final String DEFAULT_NAME = "DEFAULT_NAME";
    private static final String UPDATE_NAME = "UPDATE_NAME";

    @Autowired
    private IdAuditingRepository repository;

    private IdAuditing auditing;

    @Before
    public void initTest() {
        auditing = new IdAuditing();
        auditing.setName(DEFAULT_NAME);
    }

    @Test
    @Transactional
    public void create() throws Exception {
        int size = repository.findAll().size();
        repository.saveAndFlush(auditing);
        List<IdAuditing> auditings = repository.findAll();
        Assertions.assertThat(auditings).hasSize(size + 1);
        IdAuditing test = auditings.get(auditings.size() - 1);
        Assertions.assertThat(test.getId()).isNotNull();
        Assertions.assertThat(test.getName()).isEqualTo(DEFAULT_NAME);
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
        IdAuditing update = repository.findOne(auditing.getId());
        update.setName(UPDATE_NAME);
        repository.saveAndFlush(update);
        List<IdAuditing> auditings = repository.findAll();
        Assertions.assertThat(auditings).hasSize(size);
        IdAuditing test = auditings.get(auditings.size() - 1);
        Assertions.assertThat(test.getName()).isEqualTo(UPDATE_NAME);
        Assertions.assertThat(test.getCreatedDate()).isNotEqualTo(test.getLastModifiedDate());
    }
}
