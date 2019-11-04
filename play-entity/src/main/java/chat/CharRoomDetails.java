package chat;

import lombok.Data;

@Data
public class CharRoomDetails extends ChatRoom {
    private Long id;

    private Long roomId;

    private Long builder;

    private String roomNumber;

    private Integer currentNumber;

    private Integer maxNumber;
}
