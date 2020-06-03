package hcmute.edu.vn.foody_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FindFoodActivity extends AppCompatActivity {

    ListView lstQuan;
    ListView lstTinh;
    ArrayList<Store> arrayStore;
    ArrayList<String> arrayTinh;
    StoreAdapter storeAdapter;


    ImageView imgBack;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_food);

        imgBack = (ImageView) findViewById(R.id.img_arrow);
        lstQuan = (ListView) findViewById(R.id.lstQuan);
        lstTinh = (ListView) findViewById(R.id.lstTinh);
        btnClick = (Button) findViewById(R.id.btn_click);
        arrayStore = new ArrayList<>();
        arrayTinh = new ArrayList<>();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//       lstTinh.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
//           @Override
//           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               Intent intent = new Intent(FindFoodActivity.this, DetailStore.class);
//               startActivity(intent);
//               Toast.makeText(FindFoodActivity.this, "fddf", Toast.LENGTH_SHORT).show();
//           }
//       });
//        lstQuan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//
//                Intent intent = new Intent(FindFoodActivity.this, DetailStore.class);
//                startActivity(intent);
//            }
//        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindFoodActivity.this, DetailStore.class);
                startActivity(intent);

            }
        });


        ThemQuan();
        storeAdapter = new StoreAdapter(this, R.layout.item_detail_store, arrayStore);
        lstQuan.setAdapter(storeAdapter);

        arrayTinh.add("Bắc Ninh");
        arrayTinh.add("Bến Tre");
        arrayTinh.add("Bình Dương");
        arrayTinh.add("Bình Định");
        arrayTinh.add("Hà Nội");
        arrayTinh.add("TP Hồ Chí Minh");
        ArrayAdapter adapter = new ArrayAdapter(FindFoodActivity.this, android.R.layout.simple_list_item_1, arrayTinh);
        lstTinh.setAdapter(adapter);


    }

    public void ThemQuan(){
        arrayStore.add(new Store("Bún đậu cô Chang","Chợ Bùi Đức, Quốc Lộ 1A", "Quán Ăn", 18, 6.3, 4.2, 34, R.drawable.bundau));
        arrayStore.add(new Store("Bún đậu Long Xuyên","76 Hưng Đạo Vương, P.Thanh Bình", "Quán Ăn", 27, 4.1, 1.5, 60, R.drawable.bundaulx));
        arrayStore.add(new Store("Bún riêu Công","93 Huỳnh Văn Luỹ, P.Hoà Bình", "Quán Ăn", 8, 6.5, 2.1, 31, R.drawable.buntieu));

    }

}
