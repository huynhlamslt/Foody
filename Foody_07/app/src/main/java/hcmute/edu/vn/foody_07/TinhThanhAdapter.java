package hcmute.edu.vn.foody_07;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TinhThanhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TinhThanh> tinhThanhList;

    public TinhThanhAdapter(Context context, int layout, List<TinhThanh> tinhThanhList) {
        this.context = context;
        this.layout = layout;
        this.tinhThanhList = tinhThanhList;
    }

    @Override
    public int getCount() {
        return tinhThanhList.size();
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
        ImageView img;
        TextView txtTenTinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.txtTenTinh = (TextView) convertView.findViewById(R.id.txtTinh);
            holder.img = (ImageView) convertView.findViewById(R.id.imgTick);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }



        TinhThanh tinhThanh = tinhThanhList.get(position);

        holder.txtTenTinh.setText(tinhThanh.getTen());
        holder.txtTenTinh.setTextColor(Color.parseColor(tinhThanh.getMau()));
        holder.img.setImageResource(tinhThanh.getTick());

        return convertView;
    }
}
