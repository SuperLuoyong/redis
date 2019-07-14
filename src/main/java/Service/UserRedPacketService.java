package Service;

import java.sql.SQLException;

public interface UserRedPacketService {
    //用 redis抢红包
    public Long gradRedPacketByRedis(Long redPacketId, Long userId) throws SQLException;
}
