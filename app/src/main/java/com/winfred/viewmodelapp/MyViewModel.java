package com.winfred.viewmodelapp;

import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    public void increaseCounter(View view){
       int currentCounter = counter.getValue() !=null ? counter.getValue():0;

       counter.setValue(currentCounter+1);
    }

    public MutableLiveData<Integer> getCounter() {
        return counter;
    }
}
