package user;

import base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class Account extends BaseEntity {
    private Long id;

    private String uniqueId;

    private String username;

    private String password;

    private String salt;

    private String secretKey;

    private Timestamp LastLoginTime;

    private String email;

    private String phone;

    private Integer gender;

    private String nickname;
}
