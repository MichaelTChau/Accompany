package com.test.accompany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewRequestActivity extends AppCompatActivity {

    private Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_requests);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);

        // Construct the data source
        final ArrayList<Request> arrayRequests = new ArrayList<Request>();

        final Request r = new Request("Joe", "Alice", 18, null, "Looking for someone to eat with",
                false, false);

        arrayRequests.add(r);
        // Create the adapter to convert the array to views
        RequestAdapter adapter = new RequestAdapter(this, arrayRequests);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.requestList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Request request = (Request) adapterView.getAdapter().getItem(position);
                Intent intent = new Intent(ViewRequestActivity.this, RequestInfoActivity.class);
                intent.putExtra("request", r);
                startActivity(intent);
                // Display request info
            }
        });
    }
}
