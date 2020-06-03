package hcmute.edu.vn.foody_07;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> lstFood;


    Button btnTinh;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        lstFood = new ArrayList<>();
        lstFood.add(new Food("Canh bún cô ba", "Mã khuyến mãi. Có người mới đặt giao hàng tận nơi", R.drawable.canhbun));
        lstFood.add(new Food("Napoli Coffee", "Mã khuyến mãi. Có người mới đặt giao hàng tận nơi", R.drawable.coffee));
        lstFood.add(new Food("Đất coffee & tea", "Mã khuyến mãi. Có người mới đặt giao hàng tận nơi", R.drawable.tea));
        lstFood.add(new Food("Justa tea", "Nhân viên quán thân thiện, làm hơi chậm xíu", R.drawable.justa));
        lstFood.add(new Food("Hảo Hảo - Mực nướng sa tế", "Mã khuyến mãi. Có người mới đặt giao hàng tận nơi", R.drawable.mucnuong));
        lstFood.add(new Food("Ốc cười", "Có người mới đặt giao hàng tận nơi", R.drawable.occuoi));
        lstFood.add(new Food("Thiên Du & Sky Sushi", "Có người mới đặt giao hàng tận nơi", R.drawable.sushi));
        lstFood.add(new Food("Ché khúc bạch thanh", "Có người mới đặt giao hàng tận nơi", R.drawable.che));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.rcv_list);
        FoodAdapter myAdapter = new FoodAdapter(this, lstFood);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);



        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent provinceIntent = new Intent(MainActivity.this, TinhActivity.class);
                startActivity(provinceIntent);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindFoodActivity.class);
                startActivity(intent);
            }
        });
    }

    public void AnhXa(){
        btnTinh = (Button) findViewById(R.id.btn_tinh);
        btnSearch = (Button) findViewById(R.id.btnSearch);
    }



}
