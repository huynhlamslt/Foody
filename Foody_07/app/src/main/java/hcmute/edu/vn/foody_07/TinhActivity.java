package hcmute.edu.vn.foody_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TinhActivity extends AppCompatActivity {

    ListView lstTinh;
    ArrayList<TinhThanh> arrayTinh;
    TinhThanhAdapter tinhThanhAdapter;

    Button btnHuy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh);

        btnHuy = (Button) findViewById(R.id.btn_tinh_huy);
        lstTinh = (ListView) findViewById(R.id.lv_Tinh);

        arrayTinh = new ArrayList<>();


        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //arrayTinh.add(new TinhThanh("Đồng Nai", R.drawable.tick));
        ThemTinh();
        tinhThanhAdapter = new TinhThanhAdapter(this, R.layout.item_tinh, arrayTinh);
        lstTinh.setAdapter(tinhThanhAdapter);
    }

    public void ThemTinh(){
        arrayTinh.add(new TinhThanh("TP.HCM", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Hà Nội", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Đà Nẵng", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Hải Phòng", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Cần Thơ", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Đồng Nai", R.drawable.tick, "#00BCD4"));
        arrayTinh.add(new TinhThanh("Vũng Tàu", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("An Giang", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bạc Liêu", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bắc Cạn", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bắc Giang", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bắc Ninh", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bến Tre", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bình Dương", 0,"#E60E0D0D"));
        arrayTinh.add(new TinhThanh("Bình Định", 0,"#E60E0D0D"));
    }
}
