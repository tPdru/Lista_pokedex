package br.com.etecia.lista;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class Pokemos {
    private int idImgPokemon;
    private String idTxtNomePokemon;
    private String idTxtPokedex;

    public Pokemos(int idImgPokemon, String idTxtNomePokemon, String idTxtPokedex) {
        this.idImgPokemon = idImgPokemon;
        this.idTxtNomePokemon = idTxtNomePokemon;
        this.idTxtPokedex = idTxtPokedex;
    }

    public int getIdImgPokemon() {
        return idImgPokemon;
    }

    public void setIdImgPokemon(int idImgPokemon) {
        this.idImgPokemon = idImgPokemon;
    }

    public String getIdTxtNomePokemon() {
        return idTxtNomePokemon;
    }

    public void setIdTxtNomePokemon(String idTxtNomePokemon) {
        this.idTxtNomePokemon = idTxtNomePokemon;
    }

    public String getIdTxtPokedex() {
        return idTxtPokedex;
    }

    public void setIdTxtPokedex(String idTxtPokedex) {
        this.idTxtPokedex = idTxtPokedex;
    }
}
