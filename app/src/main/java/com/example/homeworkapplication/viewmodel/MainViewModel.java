package com.example.homeworkapplication.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.homeworkapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<Person>> _people = new MutableLiveData<List<Person>>();


    public LiveData<List<Person>> getPeople() {
        return _people;
    }

    public void loadPeopleList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(21, "Mike", "Jones", "mjones@yhj.com"));
        people.add(new Person(45, "Mike", "Tyson", "mTyson@gh.com"));
        people.add(new Person(86, "Car", "Note", "cNote@asr.com"));
        people.add(new Person(23, "Lost", "Soul", "lSoul@dfg.com"));
        people.add(new Person(19, "Money", "Resides", "moneyResides@rtyh.com"));
        people.add(new Person(21, "Fan", "Tastic", "fantastic@fdsag.com"));
        people.add(new Person(21, "Mike", "Jones", "mjones@yhj.com"));
        people.add(new Person(45, "Mike", "Tyson", "mTyson@gh.com"));
        people.add(new Person(86, "Car", "Note", "cNote@asr.com"));
        people.add(new Person(23, "Lost", "Soul", "lSoul@dfg.com"));
        people.add(new Person(19, "Money", "Resides", "moneyResides@rtyh.com"));
        people.add(new Person(21, "Fan", "Tastic", "fantastic@fdsag.com"));
        people.add(new Person(21, "Mike", "Jones", "mjones@yhj.com"));
        people.add(new Person(45, "Mike", "Tyson", "mTyson@gh.com"));
        people.add(new Person(86, "Car", "Note", "cNote@asr.com"));
        people.add(new Person(23, "Lost", "Soul", "lSoul@dfg.com"));
        people.add(new Person(19, "Money", "Resides", "moneyResides@rtyh.com"));
        people.add(new Person(21, "Fan", "Tastic", "fantastic@fdsag.com"));
        people.add(new Person(21, "Mike", "Jones", "mjones@yhj.com"));
        people.add(new Person(45, "Mike", "Tyson", "mTyson@gh.com"));
        people.add(new Person(86, "Car", "Note", "cNote@asr.com"));
        people.add(new Person(23, "Lost", "Soul", "lSoul@dfg.com"));
        people.add(new Person(19, "Money", "Resides", "moneyResides@rtyh.com"));
        people.add(new Person(21, "Fan", "Tastic", "fantastic@fdsag.com"));
        people.add(new Person(21, "Mike", "Jones", "mjones@yhj.com"));
        people.add(new Person(45, "Mike", "Tyson", "mTyson@gh.com"));
        people.add(new Person(86, "Car", "Note", "cNote@asr.com"));
        people.add(new Person(23, "Lost", "Soul", "lSoul@dfg.com"));
        people.add(new Person(19, "Money", "Resides", "moneyResides@rtyh.com"));
        people.add(new Person(21, "Fan", "Tastic", "fantastic@fdsag.com"));
        people.add(new Person(21, "Mike", "Jones", "mjones@yhj.com"));
        people.add(new Person(45, "Mike", "Tyson", "mTyson@gh.com"));
        people.add(new Person(86, "Car", "Note", "cNote@asr.com"));
        people.add(new Person(23, "Lost", "Soul", "lSoul@dfg.com"));
        people.add(new Person(19, "Money", "Resides", "moneyResides@rtyh.com"));
        people.add(new Person(21, "Fan", "Tastic", "fantastic@fdsag.com"));
        _people.setValue(people);
    }

}
