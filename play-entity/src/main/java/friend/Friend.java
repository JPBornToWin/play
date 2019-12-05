package friend;

import base.BaseEntity;
import lombok.Data;

@Data
public class Friend extends BaseEntity {

    private Long id;

    // 拥有用户id
    private Long ownerId;

    // 朋友id
    private Long friendId;

    // 备注
    private String nameNote;

    // 分组
    private String groupName;

    // 当前连续聊天天数
    private Integer currentChatDays;

    // 历史最高聊天天数
    private Integer maxChatDays;
}
