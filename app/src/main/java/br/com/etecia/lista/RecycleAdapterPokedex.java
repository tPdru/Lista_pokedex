package br.com.etecia.lista;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapterPokedex extends RecyclerView.Adapter<RecycleAdapterPokedex.ViewHolder> {



    @NonNull
    @Override
    public RecycleAdapterPokedex.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapterPokedex.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    //imagem texto  e cards
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
