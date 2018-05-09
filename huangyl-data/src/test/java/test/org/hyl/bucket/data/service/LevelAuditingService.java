package test.org.hyl.bucket.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.org.hyl.bucket.data.repository.LevelAuditingRepository;

@Service
public class LevelAuditingService {

    @Autowired
    private LevelAuditingRepository repository;


}
