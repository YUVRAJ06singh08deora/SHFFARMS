package com.example.shffarms.Adaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shffarms.Domain.Category_Activity_Domain;
import com.example.shffarms.R;

import java.util.List;

public class CategoryActivityAdaptor extends RecyclerView.Adapter<CategoryActivityAdaptor.viewHolder>{
    private List<Category_Activity_Domain> itemlist;

    public CategoryActivityAdaptor(List<Category_Activity_Domain> itemlist) {
        this.itemlist = itemlist;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_design,parent,false);
        return new CategoryActivityAdaptor.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        int pimg = itemlist.get(position).getProductImage1();
        String pname = itemlist.get(position).getProductName1();
        String pdesc = itemlist.get(position).getShortDesc1();
        String pprice = itemlist.get(position).getPrice1();
        int adbtn = itemlist.get(position).getAddBtn1();
        int pimg1 = itemlist.get(position).getProductImage2();
        String pname1 = itemlist.get(position).getProductName2();
        String pdesc1 = itemlist.get(position).getShortDesc2();
        String pprice1 = itemlist.get(position).getPrice2();
        int adbtn1 = itemlist.get(position).getAddBtn2();

        holder.setData(pimg, pname, pdesc, pprice, adbtn,pimg1, pname1, pdesc1, pprice1, adbtn1);
    }

    @Override
    public int getItemCount() {
        return itemlist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView_product1;
        private TextView productname_txtView1;
        private TextView product_desc_txtView1;
        private TextView productPrice_txtView1;
        private ImageView image_addBtn1;
        private ImageView imageView_product2;
        private TextView productname_txtView2;
        private TextView product_desc_txtView2;
        private TextView productPrice_txtView2;
        private ImageView image_addBtn2;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_product1=itemView.findViewById(R.id.productImage1);
            productname_txtView1=itemView.findViewById(R.id.productname1);
            product_desc_txtView1=itemView.findViewById(R.id.shortDesc1);
            productPrice_txtView1=itemView.findViewById(R.id.price1);
            image_addBtn1=itemView.findViewById(R.id.addBtn1);
            imageView_product2=itemView.findViewById(R.id.productImage2);
            productname_txtView2=itemView.findViewById(R.id.productname2);
            product_desc_txtView2=itemView.findViewById(R.id.shortDesc2);
            productPrice_txtView2=itemView.findViewById(R.id.price2);
            image_addBtn2=itemView.findViewById(R.id.addBtn2);

        }
        public void setData(int pimg, String pname, String pdesc, String pprice, int adbtn, int pimg1, String pname1, String pdesc1, String pprice1, int adbtn1) {
            imageView_product1.setImageResource(pimg);
            productname_txtView1.setText(pname);
            product_desc_txtView1.setText(pdesc);
            productPrice_txtView1.setText(pprice);
            image_addBtn1.setImageResource(adbtn);
            imageView_product2.setImageResource(pimg1);
            productname_txtView2.setText(pname1);
            product_desc_txtView2.setText(pdesc1);
            productPrice_txtView2.setText(pprice1);
            image_addBtn2.setImageResource(adbtn1);
        }
    }
}
