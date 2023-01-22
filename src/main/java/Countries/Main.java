package Countries;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Main {
    public static void main(String[] args) {
        CountriesApi api = CountriesService.getApi();
        Call<List<Country>> call = api.getCountries();
        call.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                if (response.isSuccessful()) {
                    List<Country> countries = response.body();
                    System.out.println("50 primeros paises");
                    for (int i = 0; i < 50; i++) {

                        Country country = countries.get(i);
                        System.out.println("____________________________________________");
                        System.out.println(country.getName()+" :");
                        System.out.println("    Capital: " + country.getCapital());
                        System.out.println("    Region: " + country.getRegion());
                        System.out.println("    Population: " + country.getPopulation());
                        System.out.println("____________________________________________");
                    }
                } else {
                    System.out.println("Error en la petición: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                System.out.println("Error en la petición: " + t.getMessage());
            }
        });
    }
}