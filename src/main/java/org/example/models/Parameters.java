package org.example.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.application.ApplicationConstants;

@Getter
@NoArgsConstructor
public class Parameters {

    private Integer x;
    private Double y;
    private Integer r;

    public Parameters buildX(String x){
        this.x = Integer.parseInt(x);
        if (this.x < -5 || this.x > 5){
            throw new IllegalArgumentException("X is not valid");
        }
        return this;
    }

    public Parameters buildY(String y){
        if (!y.matches(ApplicationConstants.INTERVAL_PARAMETER_Y)){
            throw new IllegalArgumentException("Y is not valid");
        }
        this.y = Double.parseDouble(y);
        return this;
    }

    public Parameters buildR(String r){
        this.r = Integer.parseInt(r);
        if (this.r < 1 || this.r > 5){
            throw new IllegalArgumentException("R is not valid");
        }
        return this;
    }

    public boolean checkInArea(){
        return y >= 0 && x >= 0 && r - x >= y ||
                y <= 0 && x <= 0 && x >= -r && y >= -r / 2. ||
                        x <= 0 && y >= 0 && x * x + y * y <= (r / 2.) * (r / 2.);
    }

}
