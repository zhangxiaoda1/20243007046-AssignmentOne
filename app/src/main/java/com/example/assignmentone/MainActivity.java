package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The same IDs exist in both portrait and landscape layouts.
        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        // Each button shows a short Toast so the click events can be verified.
        btnFacilities.setOnClickListener(v ->
                Toast.makeText(this, R.string.toast_facilities, Toast.LENGTH_SHORT).show());
        btnEvents.setOnClickListener(v ->
                Toast.makeText(this, R.string.toast_events, Toast.LENGTH_SHORT).show());
        btnClubs.setOnClickListener(v ->
                Toast.makeText(this, R.string.toast_clubs, Toast.LENGTH_SHORT).show());
        btnSupport.setOnClickListener(v ->
                Toast.makeText(this, R.string.toast_support, Toast.LENGTH_SHORT).show());
    }
}
