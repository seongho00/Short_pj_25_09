package com.koreait.short_pj_25_09;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Surl {

    private long id;
    @Builder.Default // builder 할 떄 default 값 설정
    private LocalDateTime createDate = LocalDateTime.now();
    @Builder.Default
    private LocalDateTime modifyDate = LocalDateTime.now();
    private String body;
    private String url;

    @Setter(AccessLevel.NONE) // setter 적용 x
    private long count;

    public void increaseCount() {
        this.count += 1;
    }
}
