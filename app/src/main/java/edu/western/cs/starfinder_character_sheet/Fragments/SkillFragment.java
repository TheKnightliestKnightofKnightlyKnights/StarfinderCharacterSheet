package edu.western.cs.starfinder_character_sheet.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.western.cs.starfinder_character_sheet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SkillFragment extends Fragment {

    TextView textView;
    public SkillFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_skill, container, false);
        textView = (TextView)view.findViewById(R.id.dexterity_acrobatics_number);
                Bundle bundle = getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        textView.setText("This worked. kinda"+message);
        return view;
    }

}
