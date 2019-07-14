package controller;


import Service.impl.UserRedPacketImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/userRedPacket")
public class UserRedPacketController {



    @Autowired
    UserRedPacketImpl userRedPacket = null;

    //使用redis
    @RequestMapping("/grapRedPacketByRedis")
    @ResponseBody
    public Map<String, Object> grapRedPacketByRedis(Long redPacketId, Long userId) throws SQLException {
        System.out.println(redPacketId+""+userId);
        // 抢红包
        Long result = userRedPacket.gradRedPacketByRedis(redPacketId, userId);
        Map<String, Object> retMap = new HashMap<String, Object>();
        boolean flag = result > 0;
        retMap.put("success", flag);
        retMap.put("message", flag ? "抢红包成功" : "抢红包失败");
        return retMap;
    }
}
