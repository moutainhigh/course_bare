package com.huatu.tiku.course.spring.conf.base;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static com.huatu.common.consts.ApolloConfigConsts.NAMESPACE_TIKU_CACHE_REDIS;


/**
 * sentinel pool
 */

@Data
@Component
@ConfigurationProperties(prefix = "spring.redis.sentinel")
@EnableApolloConfig(NAMESPACE_TIKU_CACHE_REDIS)
public class SentinelProperties {
    private String masterName;
    private String nodes;
    private Integer database;
    private Integer poolMaxTotal;
    private Integer poolMaxActive;
    private Integer poolMaxWait;
    private Integer poolMaxIdle;
    private Integer poolMinIdle;
    private Integer timeout;
}
