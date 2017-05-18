package com.test.accompany;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GoogleMap googleMap = null; //THIS

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    private LatLngBounds WATERLOO;
    private LatLng markerPos;
    //mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLng(43.45, -80.55), new LatLng(43.48, -80.52), 0));

        @Override
        public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        WATERLOO = new LatLngBounds(new LatLng(43.45, -80.55), new LatLng(43.48, -80.52));

        UiSettings settings = googleMap.getUiSettings();
        settings.setAllGesturesEnabled(true);
        settings.setZoomControlsEnabled(true);

        //LatLng wloo = new LatLng(43.45, -80.53);
        mMap.addMarker(new MarkerOptions().position(WATERLOO.getCenter()).draggable(true)); //can change waterloo to pointer location

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(WATERLOO.getCenter(),15));
        mMap.setLatLngBoundsForCameraTarget(WATERLOO);

            mMap.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() {
                @Override
                public void onMarkerDragStart(Marker marker) {

                }

                @Override
                public void onMarkerDrag(Marker marker) {

                }

                @Override
                public void onMarkerDragEnd(Marker marker) {
                    markerPos = marker.getPosition();
                    System.out.println(marker.getPosition().latitude);
                    System.out.println(marker.getPosition().longitude);
                }
            });
        }

        public LatLng getMarkerPos(Marker marker) {
            return markerPos;
        }

}

//retrieve address
//store and return information