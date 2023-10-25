package org.example.util;

import java.util.Objects;

public class Checker {
    public static boolean checkEmptyArgs(String ...args){
        for (String arg : args){
            if (Objects.isNull(arg) || arg.isBlank()){
                return false;
            }
        }
        return true;
    }
}
