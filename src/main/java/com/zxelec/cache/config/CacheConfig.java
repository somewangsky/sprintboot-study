package com.zxelec.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * CacheConfig
 *
 * @author vimicro
 * @date 2020/10/16
 */
@Configuration
public class CacheConfig {

    @Bean("keyGenerator")
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> method.getName() + Arrays.asList(params);
    }
}
