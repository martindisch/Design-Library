package com.martin.designlibrary;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EditFragment extends Fragment {

    private TextInputLayout mFirst;

    public static EditFragment newInstance() {
        return new EditFragment();
    }

    public EditFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_edit, container, false);
        mFirst = (TextInputLayout) rootView.findViewById(R.id.tilFirst);

        mFirst.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().contains("error")) {
                    mFirst.setError("You did it!");
                } else {
                    mFirst.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        return rootView;
    }
}
