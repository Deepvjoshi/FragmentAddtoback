package com.deepjoshi.fragtask3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Deep Joshi on 02-02-2017.
 */

public class Fragthree extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        container = (ViewGroup) inflater.inflate(R.layout.fragthree, container, false);
        Button bt = (Button) container.findViewById(R.id.Button1_frgthree);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(, "", Toast.LENGTH_SHORT).show();
              //  Fragthree frmss = new Fragthree();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
              //  ft.replace(R.id.fragloc, frmss);
                // ft.add(headlines_fragment,sp);
                // ft.add(R.id.headlines_fragment,sp);
                ft.addToBackStack(null);
                fm.popBackStack();
                ft.commit();
            }
        });
        return container;
    }
}