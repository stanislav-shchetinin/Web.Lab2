package org.example.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ApplicationConstants {
    /**
     * Regular expression for check parameter's Y interval [-3; 3]
     * */
    public static final String INTERVAL_PARAMETER_Y = "^-?(?:3(?:\\.0+)?|[0-2](?:\\.[0-9]+)?|\\.[0-9]+)$";
    public static final double MICRO_SEC = 1e-6;
}
