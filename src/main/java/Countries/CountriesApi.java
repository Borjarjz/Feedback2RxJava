package Countries;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CountriesApi {
    @GET("all")
    Call<List<Country>> getCountries();
}