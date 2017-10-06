package com.example.android.miwok;



import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Displays a {@link ViewPager} where each page shows a different day of the week.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager(),MainActivity.this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Adding TabLayout to ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}


















//package com.example.android.miwok;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//import static com.example.android.miwok.R.id.phrases;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        // Set the content of the activity to use the activity_main.xml layout file
//        setContentView(R.layout.activity_main);
//
//        // Set clickListener on the Views
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//        TextView familyMembers = (TextView) findViewById(R.id.family);
//        TextView colors = (TextView) findViewById(R.id.colors);
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//
//
//        numbers.setOnClickListener(new View.OnClickListener(){
//            //The code will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        familyMembers.setOnClickListener(new View.OnClickListener(){
//            //The code will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, FamilyMemberActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        colors.setOnClickListener(new View.OnClickListener(){
//            //The code will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        phrases.setOnClickListener(new View.OnClickListener(){
//            //The code will be executed when the numbers View is clicked on.
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//
//    public void openNumbersList (View view){
//        Intent numbersActivity = new Intent(this, NumbersActivity.class);
//        startActivity(numbersActivity);
//    }
//
//}
