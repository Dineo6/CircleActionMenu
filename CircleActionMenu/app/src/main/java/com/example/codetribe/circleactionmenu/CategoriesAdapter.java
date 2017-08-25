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

import static android.R.attr.resource;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by Codetribe on 8/7/2017.
 */

public class CategoriesAdapter extends ArrayAdapter<CategoriesPojo>
{

    public CategoriesAdapter(@NonNull Context context, List<CategoriesPojo> categories) {
        super(context, 0,categories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        CategoriesPojo currentCategory = getItem(position);

        View categoryList = convertView;
        if(categoryList == null)
        {
            categoryList = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView txtName = (TextView) categoryList.findViewById(R.id.name);
        txtName.setText(currentCategory.getName());

        RatingBar rateBar = (RatingBar) categoryList.findViewById(R.id.rating_bar);
        rateBar.setRating(currentCategory.getRatings(Float.parseFloat("2.1")));

        TextView txtStatus = (TextView) categoryList.findViewById(R.id.status);
        txtStatus.setText(currentCategory.getStatus());

        TextView txtPrice = (TextView)categoryList.findViewById(R.id.price);
        txtPrice.setText(String.valueOf(currentCategory.getPrice()));

        ImageView image = (ImageView) categoryList.findViewById(R.id.image);
        image.setImageResource(currentCategory.getmImageResourceId());

        return categoryList;
    }
}
