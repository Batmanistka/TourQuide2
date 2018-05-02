package com.example.android.tourquide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.botanicGarden, R.string.botanicGardenDescription,
                R.drawable.nature_botanic_g));
        places.add(new Place(R.string.zawadyBeach, R.string.zawadyBeachDescription,
                R.drawable.nature_wil_beach));
        places.add(new Place(R.string.morysinNatureReserve, R.string.morysinNatureReserveDescription,
                R.drawable.nature_morysin));

        // Create an new PlaceAdapter - data source is a list of places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView and will display list items for each place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}