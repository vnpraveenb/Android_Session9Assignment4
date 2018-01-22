package com.praveen.session9assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    // Declares Layout Object.
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Typecasts relative layout object and set reference to view object.
        relativeLayout = findViewById(R.id.relativeLayout);

        // Registers Context Menu to the Layout. which allows Long Press on any location of the screen
        // to display context menu.
        registerForContextMenu(relativeLayout);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Context Menu");

        // Creates Menu Inflater Object to get menu context.
        MenuInflater inflater = getMenuInflater();

        // Assigns Declared Menu XML file to MenuInflater Object.
        inflater.inflate(R.menu.context_menu,menu);
    }

    // Overrides Method for Context Menu Item Selected.
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        // Toast Selected Menu Item Title on Click.
        Toast.makeText(this, "You clicked on :" + item.getTitle() ,Toast.LENGTH_LONG).show();

        return true;
    }
}