package com.deepjoshi.fragtask3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Deep Joshi on 02-02-2017.
 */

public class Fragone extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        container = (ViewGroup) inflater.inflate(R.layout.fragone, container, false);
        Button bt = (Button) container.findViewById(R.id.Button1_frg);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Fragtwo frms= new Fragtwo();
               FragmentManager fm= getFragmentManager();
               FragmentTransaction ft=fm.beginTransaction();
               ft.replace(R.id.fragloc,frms);
               // ft.add(headlines_fragment,sp);
               // ft.add(R.id.headlines_fragment,sp);
               ft.addToBackStack(null);
               ft.commit();
           }
       });
return container;

    }
}
