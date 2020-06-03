package hcmute.edu.vn.foody_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailStore extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button btnThucdon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_store);

        btnThucdon = (Button) findViewById(R.id.btn_thucdon);

        btnThucdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailStore.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.myMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(10.850589, 106.771986);
        mMap.addMarker(new MarkerOptions().position(sydney).title("SPKT TPHCM").snippet("Đại học Sư phạm kỹ thuật TP Hồ Chí Minh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 14));

    }
}
