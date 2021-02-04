package com.example.homeworkapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.homeworkapplication.R;
import com.example.homeworkapplication.adapter.PersonAdapter;
import com.example.homeworkapplication.databinding.ActivityMainBinding;
import com.example.homeworkapplication.model.Person;
import com.example.homeworkapplication.viewmodel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    // TODO: 2/3/2021 Get data from viewmodel and load into recyclerview
    private MainViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setUpViews();

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.getPeople().observe(this, new Observer<List<Person>>() {
            @Override
            public void onChanged(List<Person> people) {
                PersonAdapter personAdapter = new PersonAdapter(people);
                binding.rvPeople.setAdapter(personAdapter);

            }
        });
    }

    private void setUpViews() {
        binding.getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.loadPeopleList();
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        binding.rvPeople.setLayoutManager(linearLayoutManager);
    }
}