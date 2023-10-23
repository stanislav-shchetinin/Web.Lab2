package org.example.models;

import lombok.*;
import org.example.application.ApplicationConstants;

import static java.lang.Math.round;

@Getter
public class HtmlTable {
    private final Parameters parameters;
    private final boolean isInArea;
    private final String scriptRunningTime;
    public HtmlTable(Parameters parameters){
        this.parameters = parameters;
        double startScriptTime = System.nanoTime();
        this.isInArea = parameters.checkInArea();
        scriptRunningTime = String.format("%.5f",
                (System.nanoTime() - startScriptTime) * ApplicationConstants.MICRO_SEC);
    }
}