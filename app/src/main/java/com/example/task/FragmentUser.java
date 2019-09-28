package com.example.task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FragmentUser extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<user> lstUser;
    public FragmentUser() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.user_fragment,container,false);
        myrecyclerview = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstUser);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstUser = new ArrayList<>();
        lstUser.add(new user("Sam Kulkarni","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Ramesh Jajodia","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Ijas Madari","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Parth Roy","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Aadi Swadipto Mondal","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Kanishka halder","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Soham Sen","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Iman Burwan","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Koyena Mitra","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Sreetama Chattopadhyay","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Suman Madari","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Srijan Majhi","1111111111",R.mipmap.ic_launcher_round));
        lstUser.add(new user("Ahmed Ansari","1111111111",R.mipmap.ic_launcher_round));

        Collections.sort(lstUser, new Comparator<user>() {
            @Override
            public int compare(final user object1, final user object2) {
                return (object2.getName().compareTo(object1.getName()));
            }
        });


    }
}
