package br.com.etecia.lista;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterViewPagePokedex extends FragmentStateAdapter {
    public AdapterViewPagePokedex(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new PokedexFragment();
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
