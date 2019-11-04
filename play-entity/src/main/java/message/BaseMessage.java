package message;

import base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public abstract class BaseMessage extends BaseEntity {
    private Long id;

    private Integer MsgType;

    private Long senderId;
}
