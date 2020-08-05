package com.example.ternakburung;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView rvCategory;
    private ArrayList<Category> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        rvCategory = v.findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(BirdData.getListData());
        showRecyclerList();
        return v;
    }



    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListCategoryAdapter listCategoryAdapter = new ListCategoryAdapter(list);
        rvCategory.setAdapter(listCategoryAdapter);
    }
}
