package Countries;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CountriesService {
    private static final String BASE_URL = "https://restcountries.com/v2/";
    private static CountriesApi api;

    public static CountriesApi getApi() {
        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            api = retrofit.create(CountriesApi.class);
        }
        return api;
    }
}