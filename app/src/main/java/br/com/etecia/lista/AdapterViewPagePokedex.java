package br.com.etecia.lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterViewPagePokedex extends RecyclerView.Adapter<AdapterViewPagePokedex.ViewHolder> {

    private Context context;
    private List<Pokemos> ListaPokemons;

    public AdapterViewPagePokedex(Context context, List<Pokemos> listaPokemons) {
        this.context = context;
        ListaPokemons = listaPokemons;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_pokedex,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modeloNome.setText(ListaPokemons.get(position).getIdTxtNomePokemon());
        holder.modeloPokedex.setText(ListaPokemons.get(position).getIdTxtPokedex());
        holder.modeloImagem.setImageResource(ListaPokemons.get(position).getIdImgPokemon());


    }

    @Override
    public int getItemCount() {
        return ListaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView modeloNome, modeloPokedex;
        ImageView modeloImagem;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modeloNome = itemView.findViewById(R.id.idTxtNome);
            modeloPokedex = itemView.findViewById(R.id.idTxtPokedex);
            modeloImagem = itemView.findViewById(R.id.idImgFoto);

        }
    }










}
