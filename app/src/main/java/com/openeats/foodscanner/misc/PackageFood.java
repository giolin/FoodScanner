package com.openeats.foodscanner.misc;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import org.json.JSONArray;
import org.json.JSONObject;

@ParseClassName("PackageFood")
public class PackageFood extends ParseObject {

    public String getBarcode() {
        return getString("barcode");
    }

    public void setBarcode(String barcode) {
        put("barcode", barcode);
    }

    public String getProductName() {
        return getString("product_name");
    }

    public void setProductName(String productName) {
        put("product_name", productName);
    }

    public String getProductUrl() {
        return getString("product_url");
    }

    public void setProductUrl(String productUrl) {
        put("product_url", productUrl);
    }

    public String getBrandName() {
        return getString("brand_name");
    }

    public void setBrandName(String brandName) {
        put("brand_name", brandName);
    }

    public String getBrandUrl() {
        return getString("brand_url");
    }

    public void setBrandUrl(String brandUrl) {
        put("brand_url", brandUrl);
    }

    public String getManufacturerName() {
        return getString("manufacturer_name");
    }

    public void setManufacturerName(String manufacturerName) {
        put("manufacturer_name", manufacturerName);
    }

    public String getManufacturerUrl() {
        return getString("manufacturer_url");
    }

    public void setManufacturerUrl(String manufacturerUrl) {
        put("manufacturer_url", manufacturerUrl);
    }

    public JSONObject getNutritionFacts() {
        return getJSONObject("nutrition_facts");
    }

    public void setNutritionFacts(JSONObject nutritionFacts) {
        put("nutrition_facts", nutritionFacts);
    }

    public JSONArray getIngredients() {
        return getJSONArray("ingredients");
    }

    public void setIngredients(JSONArray ingredients) {
        put("ingredients", ingredients);
    }

}
