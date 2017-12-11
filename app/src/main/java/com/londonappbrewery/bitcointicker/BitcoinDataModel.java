package com.londonappbrewery.bitcointicker;


import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {
    private String mValue;

    public static BitcoinDataModel gfromJson(JSONObject jsonObject){
        try {
            BitcoinDataModel BitcoinData = new BitcoinDataModel();
            double temp = jsonObject.getDouble("last");
            BitcoinData.mValue = Double.toString(temp);
            return BitcoinData ;
        }catch(JSONException e) {
            e.printStackTrace();
            return null ;
        }

    }

    public String getValue() {
        return mValue;
    }
}
