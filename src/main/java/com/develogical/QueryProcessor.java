package com.develogical;

import jdk.internal.joptsimple.internal.Strings;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }

        if(query.toLowerCase().contains("theresa may")){
            return "2019";
        }

        if (query.contains("square")) {
            String[] split = query.substring(query.indexOf(":")).split(",");
            return Arrays.asList(split).stream().map(s -> {
                double var = Math.sqrt(Double.parseDouble(s));
                if (var == Math.floor(var)) {
                    double var1 = Math.sqrt(var);
                    if (var1 == Math.floor(var1)) ;
                }
                return s;

            }).collect(Collectors.toList()).toString();
        }
        return "";
    }
}
