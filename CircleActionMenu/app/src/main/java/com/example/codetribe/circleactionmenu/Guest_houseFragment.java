package com.example.codetribe.circleactionmenu;

import android.app.Fragment;
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

public class Guest_houseFragment extends android.support.v4.app.Fragment
{
    private  static final String TAG = "Guest_houseFragment";
    private ListView guestList;
    private ArrayList<CategoriesPojo> listArray = new ArrayList<>();

    public Guest_houseFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.guest_house,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        CategoriesAdapter catAdapter = new CategoriesAdapter(getActivity(),listArray);
        guestList = (ListView)getActivity().findViewById(R.id.list);
        guestList.setAdapter(catAdapter);
    }


    public void populateList()
    {
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("2.3"),"Good",2000.00,R.drawable.acco1));
        listArray.add(new CategoriesPojo("Sun",Float.parseFloat("4.3"),"Good",2000.00,R.drawable.acco1));
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
