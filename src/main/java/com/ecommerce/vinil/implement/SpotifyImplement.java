package com.ecommerce.vinil.implement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.math3.random.RandomDataGenerator;

import com.ecommerce.vinil.model.Disco;
import com.ecommerce.vinil.model.Genero;
import com.ecommerce.vinil.repository.SpotifyRepository;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.model_objects.specification.AlbumSimplified;
import com.wrapper.spotify.requests.data.search.simplified.SearchAlbumsRequest;

import exception.SpotifyException;

import static java.math.BigDecimal.valueOf;

public class SpotifyImplement implements SpotifyRepository {

    private final SpotifyApi spotifyApi;

    public SpotifyImplement(SpotifyApi spotifyApi) {
        this.spotifyApi = spotifyApi;
    }

    @Override
    public List<Disco> consultar(Genero genero, Integer limite) {

        SearchAlbumsRequest searchAlbumsRequest = spotifyApi.searchAlbums(genero.name()).limit(limite).build();

        try {
            AlbumSimplified[] albumSimplifieds = searchAlbumsRequest.execute().getItems();
            return Arrays.asList(albumSimplifieds).stream().map(albumSimplified -> {
                Disco disco = new Disco();
                disco.setGenero(genero);
                disco.setNomeAlbum(albumSimplified.getName());
                disco.setPreco(valueOf(new RandomDataGenerator().nextUniform(10D, 30D)));
                return disco;
            }).collect(Collectors.toList());

        } catch (Exception e) {
            throw new SpotifyException();
        }
    }

}
