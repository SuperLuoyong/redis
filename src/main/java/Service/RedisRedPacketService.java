package Service;

import java.sql.SQLException;

public interface RedisRedPacketService {

    //保存抢红包列表
    public void saveUserRedPacketByRedis(Long redisPacketId,Double unitAmount) throws SQLException;


}
