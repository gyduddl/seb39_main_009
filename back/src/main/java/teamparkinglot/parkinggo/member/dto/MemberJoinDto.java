package teamparkinglot.parkinggo.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberJoinDto {

    @Email
    private String email;
    private String password;
    private String phoneNum;
    private String name;
    private String carNumber;
    private boolean svcUseAgmt;
    private boolean psInfoAgmt;
    private boolean eventAgmt;

}
