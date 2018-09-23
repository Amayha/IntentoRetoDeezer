package com.example.calupe.retodeezer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_listas;
    listaAdapter customAdapter;
    //private List<Playlist> listas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_listas=findViewById(R.id.lv_listas);
        customAdapter= new listaAdapter(this);
        lv_listas.setAdapter(customAdapter);

        //DeezerRequest req=DeezerRequestFactory.requestPlaylist(24574);

        lista lista1= new lista("Folk","PAP","5");
        customAdapter.agregarLista(lista1);

        lista lista2= new lista("Soul","Anni","10");
        customAdapter.agregarLista(lista2);

        String applicationID = "298284";
        //DeezerConnect deezerConnect = new DeezerConnect(this, applicationID);

        // the request listener
        //RequestListener listener = new JsonRequestListener() {

            public void onResult(Object result, Object requestId) {
                //   List<Album> albums = (List<Album>) result;
                //  List<Playlist> playlists=(List<Playlist>) result;
                //Log.e("DEEZER", "Albumes: "+albums.size());
                listas.addAll((List<Playlist>) result);

//                Log.e("DEEZER","Listas: "+playlists.size());

                // do something with the albums
            }

            public void onUnparsedResult(String requestResponse, Object requestId) {}

            public void onException(Exception e, Object requestId) {}
        };

// create the request
        long artistId = 11472;
        //DeezerRequest request = DeezerRequestFactory.requestArtistAlbums(artistId);

// set a requestId, that will be passed on the listener's callback methods
        //request.setId("myRequest");

// launch the request asynchronously
        //deezerConnect.requestAsync(request, listener);

    }
}

