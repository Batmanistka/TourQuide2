package com.example.android.tourquide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.wilanowPalace, R.string.wilanowPalaceDescription,
                R.drawable.mon_wil_pal));
        places.add(new Place(R.string.potockiMaus, R.string.potockiMausDescription,
                R.drawable.mon_maus_branicki));
        places.add(new Place(R.string.curchOfSantAnne, R.string.curchOfSantAnneDescription,
                R.drawable.mon_sa_church));

        // Create an new PlaceAdapter - data source is a list of places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.my_white);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView and will display list items for each place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

