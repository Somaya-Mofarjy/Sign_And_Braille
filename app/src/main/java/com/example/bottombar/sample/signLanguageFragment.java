package com.example.bottombar.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by otaib on 15/07/17.
 */

public class signLanguageFragment extends Fragment {
    private static final String TAG= "signLanguageFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.sign_language,container,false);

        return view;
    }
}
