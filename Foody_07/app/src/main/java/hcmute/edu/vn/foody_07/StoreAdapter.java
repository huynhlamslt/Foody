package hcmute.edu.vn.foody_07;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class StoreAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Store> storeList;

    public StoreAdapter(Context context, int layout, List<Store> storeList) {
        this.context = context;
        this.layout = layout;
        this.storeList = storeList;
    }

    @Override
    public int getCount() {
        return storeList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinhAnh;
        TextView txtTenQuan;
        TextView txtDiaChi;
        TextView txtLoaiQuan;
        TextView txtBinhLuan;
        TextView txtDiem;
        TextView txtKhoangCach;
        TextView txtSoAnh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.imgHinhAnh = (ImageView) convertView.findViewById(R.id.img_dt_food);
            holder.txtTenQuan = (TextView) convertView.findViewById(R.id.txt_dt_tenquan);
            holder.txtDiaChi = (TextView) convertView.findViewById(R.id.txt_dt_diachi);
            holder.txtLoaiQuan = (TextView) convertView.findViewById(R.id.txt_dt_quanan);
            holder.txtBinhLuan = (TextView) convertView.findViewById(R.id.txt_dt_cmt);
            holder.txtDiem = (TextView) convertView.findViewById(R.id.txt_dt_diem);
            holder.txtKhoangCach = (TextView) convertView.findViewById(R.id.txt_dt_khoangcach);
            holder.txtSoAnh = (TextView) convertView.findViewById(R.id.txt_dt_soanh);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Store store = storeList.get(position);

        holder.imgHinhAnh.setImageResource(store.getHinhanh());
        holder.txtTenQuan.setText(store.getTenQuan());
        holder.txtDiaChi.setText(store.getDiaChi());
        holder.txtLoaiQuan.setText(store.getLoaiQuan());
        holder.txtBinhLuan.setText(String.valueOf(store.getBinhluan()));
        holder.txtDiem.setText(String.valueOf(store.getDiem()));
        holder.txtKhoangCach.setText(String.valueOf(store.getKhoangcach()));
        holder.txtSoAnh.setText(String.valueOf(store.getSoanh()));

        return convertView;
    }

}
