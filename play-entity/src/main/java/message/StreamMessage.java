package message;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StreamMessage extends BaseMessage {
    private String path;

    private Long length;
}
