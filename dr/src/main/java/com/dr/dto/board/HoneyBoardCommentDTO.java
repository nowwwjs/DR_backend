package com.dr.dto.board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HoneyBoardCommentDTO {
    private Long replyNumber;
    private String replyText;
    private String replyWriteDate;
    private String replyModifyDate;
    private String photoLocal;
    private Long userNumber;
    private Long boardNumber;
    private Long recipeNumber;
    private String userNickName;
}
