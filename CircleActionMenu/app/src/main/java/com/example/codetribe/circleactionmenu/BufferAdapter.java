package com.example.codetribe.circleactionmenu;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Codetribe on 8/10/2017.
 */

public class BufferAdapter extends ArrayAdapter<ResturantsPojo>
{
    public BufferAdapter(@NonNull Context context, List<ResturantsPojo> bufferList) {
        super(context, 0,bufferList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        ResturantsPojo resturantObject = getItem(position);

        View buffer = convertView;
        if(buffer == null)
        {
            buffer = LayoutInflater.from(getContext()).inflate(R.layout.resturant_list,parent,false);
        }

        TextView txtName = (TextView) buffer.findViewById(R.id.name);
        txtName.setText(resturantObject.getName());

        RatingBar rateBar = (RatingBar) buffer.findViewById(R.id.rating_bar);
        rateBar.setRating(resturantObject.getRatings(Float.parseFloat("2.1")));

        TextView txtStatus = (TextView) buffer.findViewById(R.id.place);
        txtStatus.setText(resturantObject.getPlace());

        ImageView image = (ImageView) buffer.findViewById(R.id.image);
        image.setImageResource(resturantObject.getmImageResourceId());

        return buffer;
    }
}
