package com.jalaj.firstapp.fragmenttextviewdemo;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jalaj.firstapp.fragmenttextviewdemo.communicator.Messenger;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements Messenger{

    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public String readMessage() {
        return message;
    }

    @Override
    public void writeMessage(String message) {
     this.message = message;
        android.app.Fragment fragment2 = (android.app.Fragment) getFragmentManager().findFragmentById(R.id.fragment_receiver);
        ((TextView)fragment2.getActivity().findViewById(R.id.txtFragment2Text)).setText(message);
    }
}
