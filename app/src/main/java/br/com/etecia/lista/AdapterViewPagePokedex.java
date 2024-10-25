package br.com.etecia.lista;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterViewPagePokedex extends RecyclerView.Adapter<AdapterViewPagePokedex> {

    private Context context;
    private List<Pokemos> ListaPokemons;

    public AdapterViewPagePokedex(Context context, List<Pokemos> listaPokemons) {
        this.context = context;
        ListaPokemons = listaPokemons;
    }



}
