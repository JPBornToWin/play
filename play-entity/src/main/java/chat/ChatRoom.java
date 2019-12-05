package chat;

import base.BaseEntity;
import lombok.Data;

@Data
public abstract class ChatRoom extends BaseEntity {
    private String roomName;

    private Integer roomType;

    private String description;
}
