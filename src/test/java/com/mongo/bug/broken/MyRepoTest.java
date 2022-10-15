package com.mongo.bug.broken;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyRepoTest {
    @Autowired
    MyRepo repo;

    @Test
    void entityIsFound(){
        MyEntity org = MyEntity.builder().id(UUID.randomUUID()).data("foo "+ LocalDateTime.now()).build();
        MyEntity saved = repo.save(org);
        assertThat(org.getId()).isEqualTo(saved.getId());
        assertThat(repo.findById(org.getId()))
                .isNotEmpty();
    }
}