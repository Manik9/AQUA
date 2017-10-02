package binarykeys.aquainfo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {
    private FloatingActionButton floatingActionButton;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FullScreen();
        setContentView(R.layout.fragment_holder);
        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.animator.card_flip_left_in,R.animator.card_flip_out);
        View emailView = getLayoutInflater().inflate(R.layout.activity_main, null, false);
        floatingActionButton = emailView.findViewById(R.id.floatingActionButtonEmailScreen);
        floatingActionButton.setOnClickListener(this);

        try {
            transaction.replace(R.id.fragment_holder, new EmailFragment());
            transaction.commit();
        } catch (Exception e) {
            Toast.makeText(Activity1.this, "Some Error Occured", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.floatingActionButtonEmailScreen:
                Toast.makeText(Activity1.this, "Hi", Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (fragmentManager.getBackStackEntryCount() > 0){
            fragmentManager.popBackStack();
        }
        else
            super.onBackPressed();
    }

    public void onResume() {
        super.onResume();
        FullScreen();
    }

    public void FullScreen() {
        // View decorView = getWindow().getDecorView();
        //int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        //decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
