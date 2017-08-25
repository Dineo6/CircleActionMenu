package com.example.codetribe.circleactionmenu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import at.markushi.ui.CircleButton;

public class MainActivity extends Activity
{
    String cateory [] = {"Dolly","Grace","Jerry","Moira","Neppy","Linah","Johanna"};
     private CircleButton btnTwitter;
     private CircleButton btnFacebook;
     private CircleButton btnInstagram;
     public static final String CATEGORY_SELECTED = "selected_cat";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#827717"),R.drawable.ic_add_white_48dp,R.drawable.ic_remove_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_toys_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_restaurant_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_casino_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_hotel_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_add_location_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_add_location_white_48dp)
                .addSubMenu(Color.parseColor("#33691E"),R.drawable.ic_add_location_white_48dp)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Toast.makeText(getBaseContext(),"You selected " + cateory[i], Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getBaseContext(),TabActivity.class);
                        intent.putExtra(CATEGORY_SELECTED,cateory[i]);
                        startActivity(intent);
                    }
                });

        btnTwitter = (CircleButton) findViewById(R.id.iconTwitter);
        btnFacebook = (CircleButton) findViewById(R.id.iconFacebook);
        btnInstagram  = (CircleButton) findViewById(R.id.iconInstagram);
    }

}
