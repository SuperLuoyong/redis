package Bean;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTem {

    public RedisTemplate redisTemplate(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(50);
        jedisPoolConfig.setMaxTotal(100);
        jedisPoolConfig.setMaxWaitMillis(20000);
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(jedisPoolConfig);
        connectionFactory.setPort(6379);
        connectionFactory.afterPropertiesSet();
        RedisSerializer jdkredisSerializer = new JdkSerializationRedisSerializer();
        RedisSerializer stringredisSerializer = new StringRedisSerializer();
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(connectionFactory);
        redisTemplate.setDefaultSerializer(stringredisSerializer);
        redisTemplate.setKeySerializer(stringredisSerializer);
        redisTemplate.setValueSerializer(stringredisSerializer);
        redisTemplate.setHashKeySerializer(stringredisSerializer);
        redisTemplate.setHashValueSerializer(stringredisSerializer);
        return redisTemplate;
    }
}
