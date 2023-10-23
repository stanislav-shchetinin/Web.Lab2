package org.example.models;

import lombok.*;
import org.example.utils.ApplicationConstants;

@Getter
public class HtmlTable {
    private final Parameters parameters;
    private final boolean isInArea;
    private final Double scriptRunningTime;
    public HtmlTable(Parameters parameters){
        this.parameters = parameters;
        double startScriptTime = System.nanoTime();
        this.isInArea = parameters.checkInArea();
        scriptRunningTime = (System.nanoTime() - startScriptTime) * ApplicationConstants.MICRO_SEC;
    }
}