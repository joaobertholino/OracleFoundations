package model.services;

public class FormaterName {

    public static String formatName(String name) {
        String[] splited = name.split(" ");
        return splited[1] + ", " + splited[0].charAt(0) + ".";
    }
}
