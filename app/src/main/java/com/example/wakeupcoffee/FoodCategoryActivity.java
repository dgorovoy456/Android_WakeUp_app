package com.example.wakeupcoffee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listFood = getListView();
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1);
        listFood.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
    //Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);

}
