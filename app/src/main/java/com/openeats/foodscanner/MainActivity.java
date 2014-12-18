package com.openeats.foodscanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnScan = (Button) findViewById(R.id.btn_scan);
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);
                integrator.setPrompt(getResources().getString(R.string.scan));
                integrator.initiateScan();
            }
        });

        // Start of 統一布丁(雞蛋口味)
//        JSONArray otherNutritionItems = new JSONArray();
//
//        JSONObject nutritionFacts = new JSONObject();
//        try {
//            nutritionFacts.put("amount_per_portion", 100); // g or ml
//            nutritionFacts.put("portions_per_package", 1);
//            nutritionFacts.put("calories", 110); // kCal
//            nutritionFacts.put("protein", 2.1); // g
//            nutritionFacts.put("total_fat", 3.0); // g
//            nutritionFacts.put("saturated_fat", 2.7); // g
//            nutritionFacts.put("trans_fat", 0.0); //g
//            nutritionFacts.put("cholesterol", -1); // 自願標示項目-膽固醇
//            nutritionFacts.put("carbohydrate", 18.7); // g
//            nutritionFacts.put("sugars", -1); // 自願標示項目-糖
//            nutritionFacts.put("dietary_fiber", -1); // 自願標示項目-膳食纖維
//            nutritionFacts.put("sodium", 47.0); // mg
//            nutritionFacts.put("other", otherNutritionItems);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONArray ingredients = new JSONArray();
//        ingredients.put("水");
//        ingredients.put("蔗糖");
//        ingredients.put("奶粉");
//        ingredients.put("高果糖糖漿");
//        ingredients.put("麥芽糖");
//        ingredients.put("椰子油");
//        ingredients.put("天然色素(焦糖色素,黃槴子,紅麴色素)");
//        ingredients.put("刺槐豆膠");
//        ingredients.put("玉米澱粉");
//        ingredients.put("香料");
//        ingredients.put("乳化劑");
//        ingredients.put("食鹽");
//        ingredients.put("鹿角菜膠");
//        ingredients.put("乳酸鈣");
//        ingredients.put("咖啡粉");
//        ingredients.put("可可粉");
//        ingredients.put("雞蛋萃取物");
//
//        PackageFood packageFood = new PackageFood();
//        packageFood.setBarcode("4710088430915");
//        packageFood.setProductName("統一布丁(雞蛋口味)");
//        packageFood.setProductUrl("");
//        packageFood.setBrandName("統一企業(股)公司");
//        packageFood.setBrandUrl("http://www.uni-president.com.tw/");
//        packageFood.setManufacturerName("統一企業(股)公司");
//        packageFood.setManufacturerUrl("http://www.uni-president.com.tw/");
//        packageFood.setNutritionFacts(nutritionFacts);
//        packageFood.setIngredients(ingredients);
//        packageFood.saveInBackground();


        // Start of 統一陽光無加糖高纖豆漿
//        JSONObject otherNutritionItem1 = new JSONObject();
//        try {
//            otherNutritionItem1.put("name", "大豆異黃酮").put("amount", 16).put("unit", "mg");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONObject otherNutritionItem2 = new JSONObject();
//        try {
//            otherNutritionItem2.put("name", "卵磷脂").put("amount", 63).put("unit", "mg");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONArray otherNutritionItems = new JSONArray();
//        otherNutritionItems.put(otherNutritionItem1);
//        otherNutritionItems.put(otherNutritionItem2);
//
//        JSONObject nutritionFacts = new JSONObject();
//        try {
//            // the nutrition facts are evaluated by per portion
//            nutritionFacts.put("amount_per_portion", 90); // g or ml
//            nutritionFacts.put("portions_per_package", 5);
//            nutritionFacts.put("calories", 36.9); // kCal
//            nutritionFacts.put("protein", 3.1); // g
//            nutritionFacts.put("total_fat", 1.7); // g
//            nutritionFacts.put("saturated_fat", 0.3); // g
//            nutritionFacts.put("trans_fat", 0.0); // g
//            nutritionFacts.put("cholesterol", -1); // g 自願標示項目-膽固醇
//            nutritionFacts.put("carbohydrate", 3.2); // g
//            nutritionFacts.put("sugars", 0.5); // g 自願標示項目-糖
//            nutritionFacts.put("dietary_fiber", 1.8); // g 自願標示項目-膳食纖維
//            nutritionFacts.put("sodium", 15); // mg
//            nutritionFacts.put("other", otherNutritionItems);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONArray ingredients = new JSONArray();
//        ingredients.put("水");
//        ingredients.put("非基因改造黃豆");
//        ingredients.put("菊苣纖維");
//        ingredients.put("食鹽");
//
//        PackageFood packageFood = new PackageFood();
//        packageFood.setBarcode("4710088435767");
//        packageFood.setProductName("統一陽光無加糖高纖豆漿");
//        packageFood.setProductUrl("");
//        packageFood.setBrandName("統一企業(股)公司");
//        packageFood.setBrandUrl("http://www.uni-president.com.tw/");
//        packageFood.setManufacturerName("統一企業(股)公司");
//        packageFood.setManufacturerUrl("http://www.uni-president.com.tw/");
//        packageFood.setNutritionFacts(nutritionFacts);
//        packageFood.setIngredients(ingredients);
//        packageFood.saveInBackground();
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                final TextView tvResult = (TextView) findViewById(R.id.tv_result);
                tvResult.setText("Scanned: " + result.getContents());
                ParseQuery<ParseObject> query = ParseQuery.getQuery("PackageFood");
                query.whereEqualTo("barcode", result.getContents());
                query.getFirstInBackground(new GetCallback<ParseObject>() {
                    @Override public void done(ParseObject parseObject, ParseException e) {
                        if (parseObject == null) {
                            tvResult.append("\nno match");
                        } else {
                            tvResult.append("\n" + parseObject.getString("product_name"));
                        }
                    }
                });
            }
        } else {
            // This is important, otherwise the result will not be passed to the fragment
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
