package com.example.krishna.tripmaza;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;
import static com.example.krishna.tripmaza.R.drawable.contact;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);

        TextView hotels = (TextView) findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIt = new Intent(WelcomActivity.this,HotelsActivity.class);
                startActivity(hotelsIt);
            }
        });

        ImageView hotelsI = (ImageView) findViewById(R.id.hotelsImages);
        hotelsI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIi = new Intent(WelcomActivity.this,HotelsActivity.class);
                startActivity(hotelsIi);
            }
        });

        TextView packages = (TextView) findViewById(R.id.packages);
        packages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent packagesIt = new Intent(WelcomActivity.this,PackagesActivity.class);
                startActivity(packagesIt);
            }
        });

        ImageView packagesT = (ImageView) findViewById(R.id.packagesImages);
        packagesT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIi = new Intent(WelcomActivity.this,HotelsActivity.class);
                startActivity(hotelsIi);
            }
        });

        TextView places = (TextView) findViewById(R.id.places);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesIt = new Intent(WelcomActivity.this,PlacesActivity.class);
                startActivity(placesIt);
            }
        });

        ImageView placesI = (ImageView) findViewById(R.id.placesImage);
        placesI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesIi = new Intent(WelcomActivity.this,PlacesActivity.class);
                startActivity(placesIi);
            }
        });

        final TextView restaurants = (TextView) findViewById(R.id.restaurant);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RestaurantsIt = new Intent(WelcomActivity.this,RestaurantActivity.class);
                startActivity(RestaurantsIt);
            }
        });

        ImageView restaurantsI = (ImageView) findViewById(R.id.restaurantImage);
        restaurantsI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIi = new Intent(WelcomActivity.this,RestaurantActivity.class);
                startActivity(restaurantsIi);
            }
        });

        TextView contact = (TextView) findViewById(R.id.contactText);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIt = new Intent(WelcomActivity.this,ContactActivity.class);
                startActivity(contactIt);
            }
        });

        ImageView contactI = (ImageView) findViewById(R.id.contactImage);
        contactI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIi = new Intent(WelcomActivity.this,ContactActivity.class);
                startActivity(contactIi);
            }
        });

    }
}
