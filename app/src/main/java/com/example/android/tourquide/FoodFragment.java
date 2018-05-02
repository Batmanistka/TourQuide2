package com.example.android.tourquide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.kuchniaOtwarta, R.string.kuchniaOtwartaDescription,
                R.drawable.food_kuchnia_otwarta));
        places.add(new Place(R.string.restauracjaWilanow, R.string.restauracjaWilanowDescription,
                R.drawable.food_res_wil));
        places.add(new Place(R.string.plato, R.string.platoDescription,
                R.drawable.food_plato));
        places.add(new Place(R.string.stolPolski, R.string.stolPolskiDescription,
                R.drawable.food_stol_polski));

        // Create an new PlaceAdapter - data source is a list of places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView and will display list items for each place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}