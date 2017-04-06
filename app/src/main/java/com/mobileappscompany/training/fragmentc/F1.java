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
public class F1 extends Fragment {
    EditText et1;
    Button b1;

    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f1, container, false);

        et1 = (EditText) v.findViewById(R.id.eT1);
        b1 = (Button) v.findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMyText();
            }
        });

        setRetainInstance(true);

        return v;
    }

    private void sendMyText() {

        IF2Interface mA = (IF2Interface) getActivity();
        mA.iSend22(et1.getText().toString());
    }



    public interface IF2Interface{
        public void iSend22(String s);
    }

    public void setMyET(String s){
        et1.setText(s);
    }

}
