package com.dsleng.android.intelligensia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        Button bt = (Button)v.findViewById(R.id.check_button);
        bt.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),getMessage(),Toast.LENGTH_SHORT).show();
    }
    public native String getMessage();
    static {
        System.loadLibrary("spHandler");
    }
}
