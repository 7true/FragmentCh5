package tk.alltrue.fragmentch5;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void count(String data) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        WithTextViewFragment withTextViewFragment =
                (WithTextViewFragment) fragmentManager.findFragmentById(R.id.fragment_withTextView);
        
    }
}
