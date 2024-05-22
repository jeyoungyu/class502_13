package member;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Board {
    private int seq;
    private final String subject;
    private final String content;
    private String poster;

    /* public Board(String subject, String content) {
        this.subject = subject;
        this.content = content;
        } */ // @RequiredArgsConstructor 을 넣어서 뺌

}
