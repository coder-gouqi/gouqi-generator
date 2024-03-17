package com.gouqi;

import com.gouqi.model.entity.Generator;
import com.gouqi.service.GeneratorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GeneratorServiceTest {

    @Resource
    private GeneratorService generatorService;

    @Test
    public void testInsert() {
        Generator generator = generatorService.getById(18L);
        for (int i = 0; i < 100000; i++) {
            generator.setId(null);
            generatorService.save(generator);
        }
    }
}