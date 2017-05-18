package com.test.accompany;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RequestInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_info);

        final Request request = getIntent().getParcelableExtra("request");

        String request_title = "Looking for someone to eat with";
        String request_name = "Joe";
        int age = 18;
        // GoogleMap location = request.getLocation();


        TextView text_title = (TextView) findViewById(R.id.request_title);
        // TextView text_name = (TextView) findViewById(R.id.request_username);
        TextView text_age = (TextView) findViewById(R.id.request_age);
        Button accept_request = (Button) findViewById(R.id.accept_request);

        text_title.setText(request_title);
        // text_name.setText(request_name);
        text_age.setText("Joe, 18");

        accept_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RequestInfoActivity.this, MessageRequest.class);
                intent.putExtra("name", "Alice");
                startActivity(intent);
            }
        });
    }
}
