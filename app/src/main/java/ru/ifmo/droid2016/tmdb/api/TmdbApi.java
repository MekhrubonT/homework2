package ru.ifmo.droid2016.tmdb.api;

import android.net.Uri;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Методы для работы с The Movie DB API
 *
 * https://www.themoviedb.org/documentation/api
 */
public final class TmdbApi {
    private static final String API_KEY = "1b7c9735b329608e6544382064326ae5";
    private static final Uri BASE_URI = Uri.parse("https://api.themoviedb.org/3");


    private TmdbApi() {}

    /**
     * Возвращает {@link HttpURLConnection} для выполнения запроса популярных фильмов
     *
     * https://developers.themoviedb.org/3/movies/get-popular-movies
     *
     * @param lang язык пользователя
     */
    public static HttpURLConnection getPopularMoviesRequest(String lang) throws IOException {
        // TODO
        Uri uri = BASE_URI.buildUpon().appendPath("movie").
                                    appendPath("popular").
                appendQueryParameter("api_key", API_KEY).
                appendQueryParameter("language", lang).
                appendQueryParameter("page", "1").build();
        return (HttpURLConnection) new URL(uri.toString()).openConnection();
    }
}
