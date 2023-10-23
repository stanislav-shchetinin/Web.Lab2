package org.example.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class HtmlTable {
    private final Integer radius;
    private final Integer x;
    private final Double y;
    private final Boolean inRange;
    private final LocalDateTime currentTime;
    private final Double requestTime;
}