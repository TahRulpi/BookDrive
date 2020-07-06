package com.example.loginpage.ui.SellBooks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SellBooksViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SellBooksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sell Book fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
