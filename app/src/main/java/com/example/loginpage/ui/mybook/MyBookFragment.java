package com.example.loginpage.ui.mybook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.loginpage.R;

public class MyBookFragment extends Fragment {

    private MyBookVeiwModel mybookViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mybookViewModel= ViewModelProviders.of(this).get(MyBookVeiwModel.class);
        View root = inflater.inflate(R.layout.fragment_mybook, container, false);
        final TextView textView = root.findViewById(R.id.text_mybook);

        mybookViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
