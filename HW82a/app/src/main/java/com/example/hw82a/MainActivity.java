package com.example.hw82a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Toast.makeText(MainActivity.this, "Recents", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_favorites:
                        Toast.makeText(MainActivity.this, "Favorites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_nearby:
                        Toast.makeText(MainActivity.this, "Nearby", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}