package com.zikozee.rediscache.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching  //scans components to see caching added, we use redis
public class AppConfig {
}
