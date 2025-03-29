package com.example.zjaz2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeServiceTest {

    @Autowired
    FacadeService facadeService;

    @Test
    void shouldReturnDev() {
        assertThat(this.facadeService.execute("dev")).isEqualTo("Hello from Dev");
    }

    @Test
    void shouldReturnQA() {
        assertThat(this.facadeService.execute("qa")).isEqualTo("Hello from QA");
    }

    @Test
    void shouldReturnProd() {
        assertThat(this.facadeService.execute("prod")).isEqualTo("Hello from Prod");
    }

    @Test
    void shouldReturnStaging() {
        assertThat(this.facadeService.execute("staging")).isEqualTo("Hello from Staging");
    }
}
