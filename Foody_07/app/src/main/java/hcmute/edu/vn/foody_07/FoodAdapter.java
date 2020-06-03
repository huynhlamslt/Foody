package hcmute.edu.vn.foody_07;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.MyHolder> {

    private Context mContext;
    private List<Food> mData;

    public FoodAdapter(Context mContext, List<Food> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInfalter = LayoutInflater.from(mContext);
        view = mInfalter.inflate(R.layout.item_food,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tv_tenmon.setText(mData.get(position).getTenmon());
        holder.tv_mota.setText(mData.get(position).getMota());
        holder.imghinhanh.setImageResource(mData.get(position).getHinhanh());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        TextView tv_tenmon;
        TextView tv_mota;
        ImageView imghinhanh;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            tv_tenmon = (TextView) itemView.findViewById(R.id.txtTenmon);
            tv_mota = (TextView) itemView.findViewById(R.id.txtMota);
            imghinhanh = (ImageView) itemView.findViewById(R.id.imgHinh);
        }
    }
}
