package com.exercismcode.exercismcode.timfrommarketing;

public class Badge {

    public String print(Integer id, String name, String department) {

        String resultado = "";

        if (id != null) {
            resultado += "[" + id + "] - ";
        }

        resultado += name;

        if (department != null) {
            resultado += " - " + department.toUpperCase();
        } else {
            resultado +=  " - OWNER";
        }

        return resultado;
    }
}
