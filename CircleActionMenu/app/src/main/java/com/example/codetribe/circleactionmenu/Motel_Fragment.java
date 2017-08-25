package com.example.codetribe.circleactionmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Codetribe on 8/3/2017.
 */

public class Motel_Fragment extends android.support.v4.app.Fragment
{
    private  static final String TAG = "Motel_Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.motel_fragment,container,false);
        return view;
    }
}
