package com.jalaj.firstapp.fragmenttextviewdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.jalaj.firstapp.fragmenttextviewdemo.communicator.Messenger;

/**
 * Created by jalajmehta on 7/31/16.
 */

public class FragmentSender extends Fragment{

    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_fragment1,container,false);
        Button button = (Button) view.findViewById(R.id.btnButtonFragment1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Messenger)getActivity()).writeMessage(((EditText)view.findViewById(R.id.edTxtFragment1EditText)).getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
