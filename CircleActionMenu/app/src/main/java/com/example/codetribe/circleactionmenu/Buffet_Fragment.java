package com.example.codetribe.circleactionmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Codetribe on 8/3/2017.
 */

public class Buffet_Fragment extends android.support.v4.app.Fragment
{
    private  static final String TAG = "Buffet_fragment";
    private ListView bufferList;
    private ArrayList<ResturantsPojo> listArray = new ArrayList<>();

    public Buffet_Fragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        populateList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buffet_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        BufferAdapter bufferAdapter = new BufferAdapter(getActivity(),listArray);
        bufferList = (ListView)getActivity().findViewById(R.id.list);
        bufferList.setAdapter(bufferAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        bufferList = null;
    }


    public void populateList()
    {
        listArray.add(new ResturantsPojo("McDonalds","Witbank",Float.parseFloat("4.3"),R.drawable.attra2));
        listArray.add(new ResturantsPojo("KFC","Kwamhlanga ",Float.parseFloat("4.3"),R.drawable.attra2));
        listArray.add(new ResturantsPojo("Romans pizza","Siyabuswa",Float.parseFloat("4.3"),R.drawable.attra2));
        listArray.add(new ResturantsPojo("Chicken licken","Witbank",Float.parseFloat("4.3"),R.drawable.attra2));
    }
}
