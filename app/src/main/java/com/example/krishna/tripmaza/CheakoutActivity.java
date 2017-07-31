package com.example.krishna.tripmaza;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.krishna.tripmaza.R.id.adults;
import static com.example.krishna.tripmaza.R.id.childs;
import static com.example.krishna.tripmaza.R.id.price;

public class CheakoutActivity extends AppCompatActivity {

    int adult = 1;
    int child = 0;
    int room = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheakout);
    }

    public void decrementAdults(View view) {
        if (adult > 1) {
            adult = adult - 1;
            desplayAdults(adult);
        } else {
            adult = 1;
            desplayAdults(adult);
            Toast toast = Toast.makeText(this, "we offer trip to minimum 1 person !", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void incrementAdults(View view) {
        if (adult < 25) {
            adult = adult + 1;
            desplayAdults(adult);
        } else {
            adult = 25;
            desplayAdults(adult);
            Toast toast = Toast.makeText(this, "max 25 u can tour at once", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void decrementChild(View view) {
        if (child > 0) {
            child = child - 1;
            desplayChild(child);
        } else {
            child = 0;
            desplayChild(child);
            Toast toast = Toast.makeText(this, "we offer trip to minimum 0 child !", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void incrementChild(View view) {
        if (child < 25) {
            child = child + 1;
            desplayChild(child);
        } else {
            child = 25;
            desplayChild(child);
            Toast toast = Toast.makeText(this, "max 25 child can tour order at once", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void decrementRooms(View view) {
        if (room > 0) {
            room = room - 1;
            desplayRoom(room);
        } else {
            room = 1;
            desplayRoom(room);
            Toast toast = Toast.makeText(this, "u can have minimum 1 room !", Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void incrementRooms(View view) {
        if (room < 5) {
             room = room + 1;
            desplayRoom(room);
        } else {
            room = 5;
            desplayRoom(room);
            Toast toast = Toast.makeText(this, "max 5 room at once !", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void submitOrder(View view) {
        CheckBox fourdays = (CheckBox) findViewById(R.id.days1);
        Boolean hasFourDays = fourdays.isChecked();
        CheckBox sevendays = (CheckBox) findViewById(R.id.days2);
        Boolean hasSevenDays= sevendays.isChecked();
        CheckBox ninedays = (CheckBox) findViewById(R.id.days3);
        Boolean hasNineDays = ninedays.isChecked();
        EditText enterName = (EditText) findViewById(R.id.name);
        String name = enterName.getText().toString();
        EditText enterEmail = (EditText) findViewById(R.id.email);
        String email = enterEmail.getText().toString();
        int price = calculatePrice(adult, child, room, hasFourDays, hasSevenDays,hasNineDays);
        String packageMessage = createOrderSummary(price,adult,child,room, hasFourDays, hasSevenDays, hasNineDays,name,email);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: rockstar.katrick@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Customer :" + name);
        intent.putExtra(Intent.EXTRA_TEXT, packageMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        desplayPrice(packageMessage);

    }

    public int calculatePrice(int adult,int child,int room, Boolean hasFourDays, Boolean hasSevenDays, Boolean hasNineDays) {
        int price=0;
        if(hasFourDays){
            price = price + (adult * 4)*1000 + (child * 4)*500 + (room * 4)*7000;
        }else if(hasSevenDays){
            price = (adult * 7)*1000 + (child * 7)*500 + (room * 7)*7000;
        }else if(hasNineDays) {
             price = (adult * 9) * 1000 + (child * 9) * 500 + (room * 9) * 7000;
        }else if(hasFourDays||hasNineDays||hasSevenDays){
            Toast toast = Toast.makeText(this, "please choose any one package !!!", Toast.LENGTH_SHORT);
            toast.show();
        }else if(hasFourDays||hasNineDays||hasSevenDays==false){
            Toast toast = Toast.makeText(this, "please choose any one package !!!", Toast.LENGTH_SHORT);
            toast.show();
        }else if(hasFourDays||hasNineDays==false||hasSevenDays){
            Toast toast = Toast.makeText(this, "please choose any one package !!!", Toast.LENGTH_SHORT);
            toast.show();
        }else if(hasFourDays==false||hasNineDays||hasSevenDays){
            Toast toast = Toast.makeText(this, "please choose any one package !!!", Toast.LENGTH_SHORT);
            toast.show();
        }

        return price;
    }

    public String createOrderSummary(int price,int adult,int child,int room, Boolean hasFourDays, Boolean hasSevenDays, Boolean hasNineDays, String name,String email) {
        String packageMessage = " Name :" + name;
        packageMessage = packageMessage +"\n Email :" + email;
        packageMessage = packageMessage + "\n Adults :  " + adult;
        packageMessage = packageMessage + "\n Child :  " + child;
        packageMessage = packageMessage + "\n Room :  " + room;
        packageMessage = packageMessage + "\n Add Four Days: " + hasFourDays;
        packageMessage = packageMessage + "\n Add Seven Days: " + hasSevenDays;
        packageMessage = packageMessage + "\n Add nine Days: " + hasNineDays;
        packageMessage = packageMessage + "\nTotal Rs :" + price;
        packageMessage = packageMessage + "\nThank you!";
        return packageMessage;
    }

    private void desplayAdults(int adult) {
        TextView textView = (TextView) findViewById(R.id.adults);
        textView.setText("" + adult);
    }
    private void desplayChild(int child) {
        TextView textView = (TextView) findViewById(R.id.childs);
        textView.setText("" + child);
    }
    private void desplayRoom(int room) {
        TextView textView = (TextView) findViewById(R.id.rooms);
        textView.setText("" + room);
    }

    private void desplayPrice(String message) {
        TextView textView = (TextView) findViewById(R.id.price);
        textView.setText(message);
    }

}
