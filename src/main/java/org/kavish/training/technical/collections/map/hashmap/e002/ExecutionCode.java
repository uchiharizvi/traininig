//package org.kavish.training.technical.collections.map.hashmap.e002;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.kavish.training.utils.jsonreader.JsonReader;
//
//public class ExecutionCode {
//    public static void main(String[] args) {
//        //read from json
//        JSONObject response = JsonReader.readData("src/main/java/org/kavish/training/usecase/collections/map/hashmap/e002/response.json");
//        CardData cardData = processResponse(response);
//        System.out.println(response);
//    }
//
//    private static CardData processResponse(JSONObject response) {
//        JSONArray cards= response.getJSONArray("CardData");
//        return new CardData();
//    }
//}
