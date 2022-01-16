package com.synonism.synonism;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class GetAPI {

    public static HttpResponse<String> sendInput(String input){
        //adding word to API URL to be called
        String baseUrl = "https://wordsapiv1.p.rapidapi.com/words//similarTo";
        StringBuffer buffer = new StringBuffer(baseUrl);
        buffer.insert(40, input);
        String realUrl = buffer.toString();

        //Json string declaration
        HttpResponse<String> response = null;

        //Calling WordsAPI and getting Json data
        try {
            response = Unirest.get(realUrl)
                    .header("x-rapidapi-host", "wordsapiv1.p.rapidapi.com")
                    .header("x-rapidapi-key", "YOUR-API-KEY")
                    .asString();
        } catch (Exception e){
            System.out.println("Error connecting.");
        }

        return response;
    }

}
