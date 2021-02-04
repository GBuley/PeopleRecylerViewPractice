package com.example.homeworkapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homeworkapplication.R;
import com.example.homeworkapplication.databinding.PeopleDataBinding;
import com.example.homeworkapplication.model.Person;

import java.util.List;

// TODO: 2/3/2021 Create adapter to take a List<Person>
public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private List<Person> people;

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PeopleDataBinding dataBinding = PeopleDataBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PersonViewHolder(dataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = people.get(position);
        holder.loadPerson(person);
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder{
        private final PeopleDataBinding binding;

        public PersonViewHolder(@NonNull PeopleDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void loadPerson(Person person) {
            binding.tvPeopleInfo.setText("Age: "+person.getAge()+" Name: "+person.getLastName()+", "+person.getFirstName()+" Email: "+person.getEmail());
        }
    }

    public PersonAdapter(List<Person> person){
        this.people = person;
    }
}
