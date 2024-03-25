package com.winfred.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.winfred.viewmodelapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MyViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        binding.btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.increaseCounter();
                binding.tvCounter.setText(""+ viewModel.getCounter());
            }
        });

        binding.tvCounter.setText("" +viewModel.getCounter());

    }
}