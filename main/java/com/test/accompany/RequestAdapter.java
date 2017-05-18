package com.test.accompany;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jeffrey on 2017-03-11.
 */

public class RequestAdapter extends ArrayAdapter<Request> {
    public RequestAdapter(Context context, ArrayList<Request> requests) {
        super(context, 0, requests);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Request request = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_request, parent, false);
        }

        // Lookup view for data population
        TextView tv_title = (TextView) convertView.findViewById(R.id.tv_title);
        TextView tv_location = (TextView) convertView.findViewById(R.id.tv_location);
        TextView tv_requestee = (TextView) convertView.findViewById(R.id.tv_requestee);


        // Populate the data into the template view using the data object
        tv_title.setText(request.getTitle());
        tv_requestee.setText(request.getUsername() + ", " + request.getAge());

        // Display location city name
        // tv_location.setText(request.getLocation());

        // Return the completed view to render on screen
        return convertView;
    }
}