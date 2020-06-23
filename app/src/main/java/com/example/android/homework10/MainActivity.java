package com.example.android.homework10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_open_tasks) {
            Intent intentTasks = new Intent(MainActivity.this, TasksActivity.class);
            startActivity(intentTasks);
            return true;
        }
        if (id == R.id.action_open_countries) {
            Intent intentTasks = new Intent(MainActivity.this, CountriesCitiesActivity.class);
            startActivity(intentTasks);
            return true;
        }
        if (id == R.id.action_open_money) {
            Intent intentTasks = new Intent(MainActivity.this, MonyeActivity.class);
            startActivity(intentTasks);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}