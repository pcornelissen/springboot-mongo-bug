package com.mongo.bug.broken;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyRepoTest {
    @Autowired
    MyRepo repo;

    @Test
    void entityIsFound(){
        MyEntity org = MyEntity.builder().id(UUID.randomUUID()).data("foo").build();
        MyEntity saved = repo.save(org);
        assertThat(org.getId()).isEqualTo(saved.getId());
        assertThat(repo.findById(org.getId()))
                .isNotEmpty();
    }
}