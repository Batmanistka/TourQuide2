package com.example.android.tourquide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OthersFragment extends Fragment {

    public OthersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.golfClub, R.string.golfClubDescription,
                R.drawable.other_golf));
        places.add(new Place(R.string.kuzniaKulturalna, R.string.kuzniaDescription,
                R.drawable.other_kuznia_k));
        places.add(new Place(R.string.posterMuseum, R.string.posterDescription,
                R.drawable.other_muz_pl));
        places.add(new Place(R.string.royalWilanow, R.string.royalDescription,
                R.drawable.other_royal_w));

        // Create an new PlaceAdapter - data source is a list of places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView and will display list items for each place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}