package br.com.etecia.lista;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Pokemos> ListaPokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListaPokemons = new ArrayList<>();

        ListaPokemons.add(
                new Pokemos(R.drawable.fuecoco,"Fuecoco", "Ele fica sobre rochas quentes e usa o calor absorvido por suas escamas quadradas para criar energia de fogo.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.tinkaton,"Tinkaton", "Este Pokémon inteligente tem uma disposição muito ousada. Ele joga pedras no céu com seu martelo, mirando em Corviknight voador.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.primarina,"Primarina", "Para Primarina, cada batalha é um palco. Ela derruba sua presa com belos cantos e danças.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.decidueye,"Decidueye", "Ele habilmente esconde penas de flechas em suas asas. Ele lança essas penas com tanta precisão que elas podem perfurar uma pedra a mais de cem metros.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.hooh,"Ho-oh", "As penas de Ho-Oh brilham em sete cores dependendo do ângulo em que são atingidas pela luz. Dizem que essas penas trazem felicidade aos portadores. Dizem que esse Pokémon vive ao pé de um arco-íris.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.solgaleo,"Solgaleo", "Às vezes, o resultado da abertura de um Ultra Buraco de Minhoca é que energia e formas de vida de outros mundos são chamadas aqui para este mundo.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.entei,"Entei", "Entei personifica a paixão do magma. Acredita-se que este Pokémon tenha nascido na erupção de um vulcão. Ele envia enormes explosões de fogo que consomem completamente tudo o que tocam.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.arcanine,"Arcanine", "Um antigo pergaminho ilustrado mostra que as pessoas ficavam cativadas por seu movimento enquanto ele corria pelas pradarias.\n" +
                        "\n" +
                        "Versões:\n")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.applin,"Applin", "Ela cresce comendo a polpa de uma maçã. Applin usa seu próprio fluido corporal para fortalecer a casca da maçã e evitar que ela apodreça.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.kyogre,"Kyogre", "Por meio da Reversão Primal e com todo o poder da natureza, ele retomará sua forma verdadeira. Ele pode convocar tempestades que fazem o nível do mar subir.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.bulbasaur,"Bulbasaur", "Por algum tempo após o nascimento, ele usa os nutrientes contidos na semente em suas costas para crescer.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.charizard,"Charizard", "Se Charizard ficar realmente irritado, a chama na ponta de sua cauda queima em um tom azul claro.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.chikorita,"Chikorita", "Ele adora se aquecer na luz do sol. Ele usa a folha na cabeça para procurar lugares quentes.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.gengar,"Gengar", "Para roubar a vida de seu alvo, ele se esconde na sombra da presa e espera silenciosamente por uma oportunidade.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.mimikyu,"Mimikyu", "Este Pokémon vive em lugares escuros intocados pela luz do sol. Quando aparece diante dos humanos, ele se esconde sob um pano que lembra um Pikachu.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.squirtle,"Squirtle", "Após o nascimento, suas costas incham e endurecem em uma concha. Ele borrifa uma espuma potente de sua boca.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.torkoal,"Torkoal", "Ele queima carvão dentro de sua concha para obter energia. Ele sopra fuligem preta se estiver em perigo.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.totodile,"Totodile", "Suas mandíbulas poderosas e bem desenvolvidas são capazes de esmagar qualquer coisa. Até mesmo seu Treinador deve ter cuidado.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.turtwig,"Turtwig", "A concha em suas costas é feita de solo. Se a concha estiver úmida ao toque, Turtwig é muito saudável.")

        );
        ListaPokemons.add(
                new Pokemos(R.drawable.umbreon,"Umbreon", "Quando exposto à aura da lua, os anéis em seu corpo brilham fracamente e ele ganha um poder misterioso.")

        );

        recyclerView = findViewById(R.id.idRecPokedex);

        AdapterViewPagePokedex adapterViewPagePokedex = new AdapterViewPagePokedex(getApplicationContext(),ListaPokemons);

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));

        recyclerView.hasFixedSize();

        recyclerView.setAdapter(adapterViewPagePokedex);

    }
}