package member;


import lombok.Builder;
import lombok.Data;

import java.sql.Clob;
import java.time.LocalDateTime;


@Builder
@Data
public class Board {
    private Clob content;
    private String poster;
    private String subject;
    private long seq;
    private LocalDateTime regDt;
    private LocalDateTime modDt;

}
