package binarykeys.aquainfo;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PassFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.animator.card_flip_left_in,R.animator.card_flip_out);

        return inflater.inflate(R.layout.card_view,container,false);

    }
}
