package asder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bean.Bean;
import costomview.library.Glideimageutils;
import costomview.listviewdemo.R;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/11/13
 */


public class MyAsder extends RecyclerView.Adapter<MyAsder.MyViewHolder>{
    public MyAsder(List<Bean.ResultBean.RowsBean> namelist, Context context) {
        this.namelist = namelist;
        this.context = context;
    }

    private List<Bean.ResultBean.RowsBean> namelist;
    private Context context;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder=new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glideimageutils.Imagelode(context,namelist.get(position).getInfo().getDefault_image(),holder.imageview);
        holder.text1.setText(namelist.get(position).getInfo().getLoupan_name());
        holder.text2.setText(namelist.get(position).getInfo().getNew_price_value());
        holder.text3.setText(namelist.get(position).getInfo().getNew_price_back());
        holder.text4.setText(namelist.get(position).getInfo().getTags());
        holder.text5.setText(namelist.get(position).getInfo().getRegion_title());
        holder.text6.setText(namelist.get(position).getInfo().getSub_region_title());
    }

    @Override
    public int getItemCount() {
        return namelist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview;
        TextView text1,text2,text3,text4,text5,text6;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageview = (ImageView) itemView.findViewById(R.id.imageview);
            text1 = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
            text3 = (TextView) itemView.findViewById(R.id.text3);
            text4 = (TextView) itemView.findViewById(R.id.text4);
            text5 = (TextView) itemView.findViewById(R.id.text5);
            text6 = (TextView) itemView.findViewById(R.id.text6);
        }
    }
}
