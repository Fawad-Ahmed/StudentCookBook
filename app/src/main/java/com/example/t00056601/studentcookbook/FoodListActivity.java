package com.example.t00056601.studentcookbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class FoodListActivity extends AppCompatActivity {

    ListView foodListView;
    TextView recipeView;
    Button randomItem, back2;
    String ln;
    InputStream testr;
    Scanner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        back2 = (Button) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(FoodListActivity.this, MenuActivity.class);
                startActivity(intent);
                //setContentView(R.layout.activity_food_list);
            }
        });

        final Random randomGenerator = new Random();
        randomItem = (Button) findViewById(R.id.randomItem);
        foodListView = (ListView) findViewById(R.id.foodlistView);
        final String[] values = new String[] { "Bacon Egg Cheese Bread", "Balsamic Chicken",
                "Breakfast in a Mug", "Garlic Knot Pizza Dip", "Grilled Chilli Cheese Fries",
                "RootBeer Chicken Wingz", "Spinach Dip & Garlic Bread", "Thanks-Giving Cottege Pie"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        foodListView.setAdapter(adapter);

        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                int pos = position;
                Intent intent = new Intent(FoodListActivity.this, SelectionActivity.class);
                Intent it = new Intent(getApplicationContext(), VideoActivity.class);
                startActivity(intent);

                switch ((int) foodListView.getItemIdAtPosition(pos)) {
                    case 0:
                        testr = getResources().openRawResource(R.raw.boat_bread);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Bacon Egg Cheese Bread");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1679970002255642/"));
                            startActivity(intent);
                            //startActivity(it);
                        }
                        break;

                    case 1:
                        testr = getResources().openRawResource(R.raw.balsamic_chicken);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Balsamic Chicken");
                            intent.setData(Uri.parse("https://www.facebook.com/tiphero/videos/10154379143998761/"));
                            startActivity(intent);
                        }
                        break;

                    case 2:
                        testr = getResources().openRawResource(R.raw.breakfast_in_a_mug);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Breakfast in a Mug");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1656633827922593/"));
                            startActivity(intent);
                        }
                        break;

                    case 3:
                        testr = getResources().openRawResource(R.raw.garlic_knot_and_pizza_dip);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Garlic Knot Pizza Dip");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1670961896489786/"));
                            startActivity(intent);
                        }
                        break;

                    case 4:
                        testr = getResources().openRawResource(R.raw.grilled_chilli_cheese_fries);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Grilled Chilli Cheese Fries");
                            intent.setData(Uri.parse("https://www.youtube.com/watch?v=Zoagorypmzo"));
                            startActivity(intent);
                        }
                        break;

                    case 5:
                        testr = getResources().openRawResource(R.raw.root_beer_chicken_wingz);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","RootBeer Chicken Wingz");
                            intent.setData(Uri.parse("https://www.youtube.com/watch?v=9ViBiWY2d3U"));
                            startActivity(intent);
                        }
                        break;

                    case 6:
                        testr = getResources().openRawResource(R.raw.spinach_dip_garlic_bread);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Spinach Dip & Garlic Bread");
                            intent.setData(Uri.parse("https://www.facebook.com/BuzzFeedFood/videos/1155189614494263/"));
                            startActivity(intent);
                        }
                        break;

                    case 7:
                        testr = getResources().openRawResource(R.raw.thanksgiving_cottege_pie);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Thanks-Giving Cottege Pie");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1680491565536819/"));
                            startActivity(intent);
                        }
                        break;
                }
            }
        });


        randomItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(FoodListActivity.this, SelectionActivity.class);

                startActivity(intent);
                setContentView(R.layout.activity_selection);

                int i = new Random().nextInt(values.length);
                String random = (values[i]);

                switch (random) {
                    case "Bacon Egg Cheese Bread":
                        testr = getResources().openRawResource(R.raw.boat_bread);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Bacon Egg Cheese Bread");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1679970002255642/"));
                            startActivity(intent);
                        }
                        break;

                    case "Balsamic Chicken":
                        testr = getResources().openRawResource(R.raw.balsamic_chicken);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Balsamic Chicken");
                            intent.setData(Uri.parse("https://www.facebook.com/tiphero/videos/10154379143998761/"));
                            startActivity(intent);
                        }
                        break;

                    case "Breakfast in a Mug":
                        testr = getResources().openRawResource(R.raw.breakfast_in_a_mug);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Breakfast in a Mug");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1656633827922593/"));
                            startActivity(intent);
                        }
                        break;

                    case "Garlic Knot Pizza Dip":
                        testr = getResources().openRawResource(R.raw.garlic_knot_and_pizza_dip);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Garlic Knot Pizza Dip");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1670961896489786/"));
                            startActivity(intent);
                        }
                        break;

                    case "Grilled Chilli Cheese Fries":
                        testr = getResources().openRawResource(R.raw.grilled_chilli_cheese_fries);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Grilled Chilli Cheese Fries");
                            intent.setData(Uri.parse("https://www.youtube.com/watch?v=Zoagorypmzo"));
                            startActivity(intent);
                        }
                        break;

                    case "RootBeer Chicken Wingz":
                        testr = getResources().openRawResource(R.raw.root_beer_chicken_wingz);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","RootBeer Chicken Wingz");
                            intent.setData(Uri.parse("https://www.youtube.com/watch?v=9ViBiWY2d3U"));
                            startActivity(intent);
                        }
                        break;

                    case "Spinach Dip & Garlic Bread":
                        testr = getResources().openRawResource(R.raw.spinach_dip_garlic_bread);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Spinach Dip & Garlic Bread");
                            intent.setData(Uri.parse("https://www.facebook.com/BuzzFeedFood/videos/1155189614494263/"));
                            startActivity(intent);
                        }
                        break;

                    case "Thanks-Giving Cottege Pie":
                        testr = getResources().openRawResource(R.raw.thanksgiving_cottege_pie);
                        s = new Scanner(testr);
                        while (s.hasNext()) {
                            ln += (s.nextLine() + "\n");
                            intent.putExtra("r", ln);
                            intent.putExtra("t","Thanks-Giving Cottege Pie");
                            intent.setData(Uri.parse("https://www.facebook.com/buzzfeedtasty/videos/1680491565536819/"));
                            startActivity(intent);
                        }
                        break;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food_list, menu);
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
