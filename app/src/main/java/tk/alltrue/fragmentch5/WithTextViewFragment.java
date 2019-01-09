package tk.alltrue.fragmentch5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WithTextViewFragment extends Fragment {
    private TextView mTextView;
    private String mData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setRetainInstance(true);
        View rootView = inflater.inflate(R.layout.fragment_with_textview, container, false);
        mTextView = (TextView) rootView.findViewById(R.id.textView);

/*
        if(savedInstanceState == null){
            mTextView.setText("I calculated 0 cats");
        }else {
            mData = savedInstanceState.getString("text");
            mTextView.setText(mData);
        }*/

        return rootView;
    }

    /*@Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text", mData);
    }*/

    public void changeText(String data) {
        mData = data;
        mTextView.setText(data);
    }
}
