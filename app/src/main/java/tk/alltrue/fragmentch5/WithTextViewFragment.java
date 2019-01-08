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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_with_textview, container, false);
        mTextView = (TextView) rootView.findViewById(R.id.textView);
        return rootView;
    }

    public void changeText(String data) {
        mTextView.setText(data);
    }
}
