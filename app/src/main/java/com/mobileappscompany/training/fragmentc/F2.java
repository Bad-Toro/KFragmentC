package com.mobileappscompany.training.fragmentc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {
    EditText et2;
    Button b2;


    public F2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f2, container, false);

        et2 = (EditText) v.findViewById(R.id.eT2);
        b2 = (Button) v.findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMyText();
            }
        });

        setRetainInstance(true);

        return v;
    }

    private void sendMyText() {
        sendWithInterface();
    }

    private void sendNoInterface() {

    }
    private void sendWithInterface() {
    IF3Interface tA = (IF3Interface) getActivity();
        tA.iSend21(et2.getText().toString());
    }

    public void setMyET(String s){
        et2.setText(s);
    }

    public interface IF3Interface{
        public void iSend21(String s);
    }


}
