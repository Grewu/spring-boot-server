package com.example.springbootserver.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterpolationUtils {

    public static List<Double> convertStringToListOfDoubles(String values) {
        return Arrays.stream(values.split(","))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
