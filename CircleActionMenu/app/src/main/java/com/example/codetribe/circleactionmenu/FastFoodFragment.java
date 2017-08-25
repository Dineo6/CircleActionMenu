package com.example.codetribe.circleactionmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Codetribe on 8/3/2017.
 */

public class FastFoodFragment extends android.support.v4.app.Fragment
{
    private  static final String TAG = "FastFoodFragment";
    private ListView fastfoodList;
    private ArrayList<ResturantsPojo> listArray = new ArrayList<>();

    public FastFoodFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fastfood_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        FastFoodAdapter fastfoodAdapter = new FastFoodAdapter(getActivity(),listArray);
        fastfoodList = (ListView)getActivity().findViewById(R.id.list);
        fastfoodList.setAdapter(fastfoodAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        fastfoodList = null;
    }

    public void populateList()
    {
        listArray.add(new ResturantsPojo("McDonalds",Float.parseFloat("4.3"),R.drawable.acc8));
        listArray.add(new ResturantsPojo("KFC",Float.parseFloat("4.3"),R.drawable.attrtact3));
        listArray.add(new ResturantsPojo("Romans Pizza",Float.parseFloat("4.3"),R.drawable.enter1));
    }

}
