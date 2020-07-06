package com.example.loginpage.ui.mybook;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyBookVeiwModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyBookVeiwModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is My Book fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
