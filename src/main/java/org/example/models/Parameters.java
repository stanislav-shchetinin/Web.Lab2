package org.example.models;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.annotations.Interval;

@RequiredArgsConstructor
public class Parameters {
    @Interval(min = -5, max = 5)
    private final Integer x;
    private final Double y;
    @Interval(min = 1, max = 5)
    private final Integer r;
}
