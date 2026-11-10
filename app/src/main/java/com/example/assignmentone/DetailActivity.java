package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // The unique identifier handed over from MainActivity.
        Intent intent = getIntent();
        int index = intent.getIntExtra(MainActivity.EXTRA_TOPIC_INDEX, 0);

        // Load the three topic arrays plus the short header labels.
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);
        String[] labels = getResources().getStringArray(R.array.string_array_labels);

        // Direct array indexing, no if/switch: the index selects every value.
        String title = titles[index];
        String content = contents[index];
        String imageName = imageNames[index].trim();
        String label = labels[index];

        // Map the drawable name stored in the array to its resource id.
        int imageId = getResources().getIdentifier(
                imageName, "drawable", getPackageName());

        // Populate the header.
        ImageView headerIcon = findViewById(R.id.detail_header_icon);
        headerIcon.setImageResource(imageId);
        headerIcon.setContentDescription(label);

        TextView headerTitle = findViewById(R.id.detail_header_title);
        headerTitle.setText(label);

        // Populate the scrollable body.
        TextView titleView = findViewById(R.id.detail_title);
        titleView.setText(title);

        TextView contentView = findViewById(R.id.detail_content);
        contentView.setText(content);
    }
}
