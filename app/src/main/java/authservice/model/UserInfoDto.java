package authservice.model;

import authservice.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserInfoDto extends UserInfo {

    private String firstname;

    private String lastName;

    private long phoneNumber;

    private String email;

}
