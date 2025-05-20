package com.example.icontesting; // Ensure this matches your package name

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bar_layout); // Use the correct layout file

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId(); // Get the ID once

                if (itemId == R.id.action_home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.action_favorite) {
                    Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.action_my_page) {
                    Toast.makeText(MainActivity.this, "My Page", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

    }
}