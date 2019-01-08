package tk.alltrue.fragmentch5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WithButtonFragment extends Fragment implements View.OnClickListener {
    private int mCounter = 0;
    private Communicator mCommunicator;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_with_button, container, false);
        View rootView = inflater.inflate(R.layout.fragment_with_button, container, false);
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mCommunicator = (Communicator)getActivity();
    }

    @Override
    public void onClick(View view) {
        mCounter++;
        mCommunicator.count("I calculated " + mCounter + " cats");
    }
}
