package com.jatin.contactsdisplayapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter
{

    String names[] = {"Ayesha", "Cathy", "Manisha", "Parteek", "Sarthak"};
    String contacts[] = {"7837403006","7837403007","7837403008","7837403009","7837403010"};
    int images[] = {R.drawable.contact1,R.drawable.contact2,R.drawable.contact3,R.drawable.contact4,R.drawable.contact5};
    Activity context;
    ArrayList<MyRow> items;

    MyAdapter(Activity context)
    {
        this.context = context;
        items = new ArrayList<>();
        for (int i=0;i<names.length;i++)
        {
            items.add(new MyRow(names[i],contacts[i],images[i]));
        }
    }

    @Override
    public int getCount()
    {
        return items.size();
    }

    @Override
    public Object getItem(int position)
    {
        return items.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        /*
        1. get the root view
        2. find the view inside root view
        3. set the value of each view
        4. return the root view
        */
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_layout,null,true);
        ImageView img = rowView.findViewById(R.id.myImg);
        TextView txtName = rowView.findViewById(R.id.txtName);
        TextView txtContact = rowView.findViewById(R.id.txtContact);

        img.setImageResource(items.get(position).getImage());
        txtName.setText(items.get(position).getName());
        txtContact.setText(""+items.get(position).getContact());

        return rowView;
    }
}
