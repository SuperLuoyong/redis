package Test;

import Bean.Role;
import controller.UserRedPacketController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.web.servlet.view.script.ScriptTemplateConfig;

import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
//        DefaultRedisScript<Role> redisScript = new DefaultRedisScript<>();
//        redisScript.setScriptText("redis.call('set',KEYS[1],ARGV[1]) return redis.call('get', KEYS[1])");
//        List<String> list = new ArrayList<>();
//        list.add("role_2");
//        Role role = new Role();
//        role.setId(1L);
//        role.setRoleName("role_name_1");
//        role.setNote("role_note_1");
//        String shall  = redisScript.getSha1();
//        System.out.println(shall);
//        redisScript.setResultType(Role.class);
//        JdkSerializationRedisSerializer serializationRedisSerializer = new JdkSerializationRedisSerializer();
//        Role role1 = (Role) redisTemplate.execute(redisScript,serializationRedisSerializer,serializationRedisSerializer,list,role);
//        System.out.println(role1);
////        System.out.println(redisTemplate.execute(redisScript,serializationRedisSerializer,serializationRedisSerializer,list,role));
//        System.out.println(role1.getRoleName());

//        UserRedPacketController userRedPacketController = new UserRedPacketController();
//        for (int i=1;i<=3000;i++){
//            userRedPacketController.grapRedPacket(5,i);
//        }

    }



}
