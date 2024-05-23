package exam01;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private long USER_NO;
    private String USER_ID;
    private String UESR_PW;
    private String USER_NM;
    private String MOBILE;
    private LocalDateTime REG_DT;
}
