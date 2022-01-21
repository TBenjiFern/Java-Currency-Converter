// import HashMap to use dictionary data structure
import java.util.HashMap;

public class Currency {
    // Create variables to be used in the constructor
    HashMap<String, HashMap> conversionDict; // This is the main dictionary which will hold each sub Dict
    HashMap<String, Float> usdConversion; // USD conversions sub dict
    HashMap<String, Float> eurConversion; // EUR conversions sub dict
    HashMap<String, Float> gbpConversion; // GBP conversions sub dict

    // This is a constructor class, meaning that it serves only to populate each variable with a value
    public Currency(){
        // This is a HashMap variable which will hold a String key and a HashMap value
        conversionDict = new HashMap<String, HashMap>(); 
        // These Hashmaps will hold a String key and a Float value
        usdConversion = new HashMap<String, Float>();
        eurConversion = new HashMap<String, Float>();
        gbpConversion = new HashMap<String, Float>();

        // "Put" (Insert) each conversion value with the rate as the value and the "conversion to" as key

        // USD to many
        usdConversion.put("EUR", 0.8763f);
        usdConversion.put("GBP", 0.7327f);
        usdConversion.put("JPY", 114.57f);
        usdConversion.put("AUD", 1.3867f);
        usdConversion.put("CAD", 1.2517f);
        usdConversion.put("CHF", 0.9140f);
        usdConversion.put("CNY", 6.3482f);
        usdConversion.put("SEK", 9.0205f);
        usdConversion.put("NZD", 1.4714f);
        
        // EUR to many
        eurConversion.put("USD", 1.1412f);
        eurConversion.put("GBP", 0.8362f);
        eurConversion.put("JPY", 130.74f);
        eurConversion.put("AUD", 1.5825f);
        eurConversion.put("CAD", 1.4283f);
        eurConversion.put("CHF", 1.0431f);
        eurConversion.put("CNY", 7.2443f);
        eurConversion.put("SEK", 10.293f);
        eurConversion.put("NZD", 1.6791f);

        // GBP to many
        gbpConversion.put("USD", 1.3647f);
        gbpConversion.put("EUR", 1.1959f);
        gbpConversion.put("JPY", 156.36f);
        gbpConversion.put("AUD", 1.8925f);
        gbpConversion.put("CAD", 1.7082f);
        gbpConversion.put("CHF", 1.2474f);
        gbpConversion.put("CNY", 8.6637f);
        gbpConversion.put("SEK", 12.310f);
        gbpConversion.put("NZD", 2.0081f);

        // "Put" sub dicts into main Dictionary
        conversionDict.put("USD", usdConversion);
        conversionDict.put("EUR", eurConversion);
        conversionDict.put("GBP", gbpConversion);
    }
    // Main doesn't need to do anything, so "pass"
    public static void main(String[] args) {
        ;
    }
    // This method will access the dictionary made in the constructor and return the desire rate
    // It takes in two Strings which signify the first and second keys to access the desired rate
    public Float getRate(String fromCur, String toCur) {
        // Create new object of this class
        Currency curObj = new Currency();

        // Accessing the main Dictionary from this class object, get the value of the first key (Hashmap value to Hashmap variable)
        HashMap medium = curObj.conversionDict.get(fromCur);

        // We want to retrieve the float value by accessing the sub Dict using the second String key
        // This value MUST be saved in an object variable
        Object numObj = medium.get(toCur);

        // We can convert the Object variable to a string
        String numberString = numObj.toString();

        // ...So that we can convert that string back into a Float variable (Note, Cannot convert from Object straight to Float)
        Float rate = Float.valueOf(numberString);

        return rate; // Returns a float value
    }
}