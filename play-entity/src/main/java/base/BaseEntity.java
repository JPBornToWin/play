package base;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class BaseEntity implements Serializable {
    private Timestamp createTime;

    private Timestamp updateTime;

    private Integer status;

    public Timestamp getCreateTime() {
        return createTime == null ? new Timestamp(System.currentTimeMillis()) : createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime == null ? new Timestamp(System.currentTimeMillis()) : updateTime;
    }
}
