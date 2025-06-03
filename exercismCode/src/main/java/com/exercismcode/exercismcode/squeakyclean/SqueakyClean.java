package com.exercismcode.exercismcode.squeakyclean;

public class SqueakyClean {
    public  String clean(String identifier) {
        Boolean capitalizeNext = false;
        StringBuilder result = new StringBuilder();

        for(char c : identifier.toCharArray()) {

            if(c == ' ') {
                result.append("_");
            } else if(c == '-') {
                capitalizeNext = true;
            } else if(c == '4') {
                result.append("a");
            } else if(c == '3') {
                result.append("e");
            } else if(c == '0') {
                result.append("o");
            } else if(c == '1') {
                result.append("l");
            } else if(c == '7') {
                result.append("t");
            } else if(Character.isLetter(c)) {
                if(capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
