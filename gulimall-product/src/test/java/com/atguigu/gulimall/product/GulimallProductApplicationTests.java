package com.atguigu.gulimall.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

    @Test
    void contextLoads() {
        String s = null;
        log.info("类型的长度{}", StringUtils.hasLength(s));
    }

}
