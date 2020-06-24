package com.develogical;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }

        if (query.toLowerCase().contains("theresa may")) {
            return "2019";
        }

        if (query.contains("square")) {
            String[] split = query.substring(query.indexOf(":")).split(",");
            return Arrays.stream(split).filter(s -> {
                double var = Math.sqrt(Double.parseDouble(s));
                if (var == Math.floor(var)) {
                    double var1 = Math.sqrt(var);
                    return var1 == Math.floor(var1);
                }
                return false;
            }).collect(Collectors.toList()).toString();
        }
        return "";
    }
}
