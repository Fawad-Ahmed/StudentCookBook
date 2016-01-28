package com.example.t00056601.studentcookbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {

    Button video,selectAgain,back3;
    TextView recipeName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        back3 = (Button) findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SelectionActivity.this, FoodListActivity.class);
                startActivity(intent);
                //setContentView(R.layout.activity_food_list);
            }
        });


        video = (Button) findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SelectionActivity.this, VideoActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_video);
                setVideo();
            }
        });

        selectAgain = (Button) findViewById(R.id.selectAgain);
        selectAgain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(SelectionActivity.this, FoodListActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_food_list);
            }
        });

        Bundle bundle = getIntent().getExtras();
        //Extract the data…
        String r, t;
        r = bundle.getString("r");
        t = bundle.getString("t");
        TextView tv = (TextView) findViewById(R.id.recipeView);
        tv.setText(r);
        recipeName = (TextView) findViewById(R.id.recipeName);
        recipeName.setText(t);



    }

    public void setVideo(){
        Intent it = new Intent(getApplicationContext(), VideoActivity.class);
        String bun = getIntent().getDataString();
        it.setData(Uri.parse(bun));
        startActivity(it);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selection, menu);
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
