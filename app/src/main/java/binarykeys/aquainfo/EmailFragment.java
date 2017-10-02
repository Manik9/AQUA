package binarykeys.aquainfo;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EmailFragment extends Fragment implements View.OnClickListener {

    View v;
    private FloatingActionButton floatingActionButton;
    private Fragment previous;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.activity_main,container,false);
        floatingActionButton=v.findViewById(R.id.floatingActionButtonEmailScreen);
        floatingActionButton.setOnClickListener(this);
        previous=getFragmentManager().findFragmentById(R.id.fragment_holder);
        return v;

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.floatingActionButtonEmailScreen:ChangeFragment(new PassFragment());break;

        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    void ChangeFragment(Fragment fragment){
        final FragmentTransaction ft = getFragmentManager().beginTransaction();
        previous=getFragmentManager().findFragmentById(R.id.fragment_holder);
        ft.setCustomAnimations(R.animator.card_flip_left_in,R.animator.card_flip_out);
        ft.replace(R.id.fragment_holder, fragment, "NewFragmentTag");
        ft.addToBackStack("EmailFragment");
        ft.commit();
    }

}

