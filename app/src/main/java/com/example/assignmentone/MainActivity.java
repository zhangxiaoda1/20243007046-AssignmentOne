package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Key for the unique identifier (topic index) passed to DetailActivity.
    public static final String EXTRA_TOPIC_INDEX =
            "com.example.assignmentone.EXTRA_TOPIC_INDEX";

    // Indices matching the order of the string arrays in arrays.xml.
    private static final int INDEX_FACILITIES = 0;
    private static final int INDEX_EVENTS = 1;
    private static final int INDEX_CLUBS = 2;
    private static final int INDEX_SUPPORT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // The same IDs exist in both portrait and landscape layouts.
        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        btnFacilities.setOnClickListener(v -> openDetail(INDEX_FACILITIES));
        btnEvents.setOnClickListener(v -> openDetail(INDEX_EVENTS));
        btnClubs.setOnClickListener(v -> openDetail(INDEX_CLUBS));
        btnSupport.setOnClickListener(v -> openDetail(INDEX_SUPPORT));
    }

    // Explicit intent: starts DetailActivity and hands it the selected topic index.
    private void openDetail(int topicIndex) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_TOPIC_INDEX, topicIndex);
        startActivity(intent);
    }
}
