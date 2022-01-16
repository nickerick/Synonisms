package com.synonism.synonism;

import java.util.Objects;

public class Synomize {

    public static String synomizeString(String userInput) {

        //Variable declaration
        StringBuilder buildString = new StringBuilder();
        String draftString; // string without sentence at end
        int stringLength = 0;
        int maxStringLength = 0;

        //Preparing each word for API to check
        String[] trimmedInput = userInput.trim().split(" ");

        //Checking/Replacing words of string -- MAIN PROCESS
        for (String currWord : trimmedInput) {
            String jsonString = (GetAPI.sendInput(currWord)).getBody();
            String[] trimmedJson = jsonString.trim().split("\"");

            //Uncomment to see Json content for individual word
            //System.out.println(jsonString);

            //Checking if json has longer word replacement
            String[] longestJsonList = new String[10];
            maxStringLength = 0;
            int i = 0;
            for (String currJson : trimmedJson) {

                if (Objects.equals(currJson, "success")) {
                    break;
                }
                stringLength = currJson.length();

                if (stringLength > maxStringLength && !currJson.equals("similarTo") && !currJson.equals("word")
                        && !currJson.equals(":[]}") && !currJson.equals("{") && !currJson.equals(":") && !currJson.equals(",")) {
                    maxStringLength = stringLength;
                    longestJsonList[i] = currJson;
                    i++;
                }

            }

            buildString.append(longestJsonList[i - 1]).append(" ");
        }

        // Formatting string for final output
        buildString.setCharAt(buildString.length() - 1, '.');
        draftString = buildString.toString();
        String finalString = draftString.substring(0, 1).toUpperCase() + draftString.substring(1);

        return finalString;

    }

}
