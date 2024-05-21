package member;

import lombok.*;

import java.time.LocalDateTime;
/*
@Getter @Setter @ToString
@EqualsAndHashCode
 */
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE) // 기본 생성자
@AllArgsConstructor
public class Member {
    private String userId;
    private String uesrNm;
    private String email;
    private LocalDateTime regDt;
}
