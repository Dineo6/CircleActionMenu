package com.example.codetribe.circleactionmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Codetribe on 8/3/2017.
 */

public class Hotel_Fragment extends android.support.v4.app.Fragment
{
    private  static final String TAG = "Hotel_Fragment";
    private ListView listHotel;
    private ArrayList<CategoriesPojo> listArray = new ArrayList<>();

    public Hotel_Fragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotel_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
       CategoriesAdapter catAdapter = new CategoriesAdapter(getActivity(),listArray);
        listHotel = (ListView)getActivity().findViewById(R.id.list);
        listHotel.setAdapter(catAdapter);
    }

    public void populateList()
    {
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("2.3"),"Good",2000.00,R.drawable.facebook));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.attra2));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));



    }
}
