package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    public static final String[] EXTRA_MESSAGE = {"It is certain", "It is decidedly so", "Without a doubt",
        "Yes definitely", "You may rely on it", "As I see it yes", "Most likely", "Outlook good", "Yes",
        "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now",
        "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
        "My sources say no", "Outlook not so good", "Very doubtful"};
    int random = (int) ((Math.random() * EXTRA_MESSAGE.length) + 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = EXTRA_MESSAGE[random];
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
