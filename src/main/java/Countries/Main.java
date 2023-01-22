package Countries;

import java.util.List;
import java.util.stream.Collectors;

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
                    System.out.println("Lista de nombres paises:");
                    for (int i = 0; i < countries.size(); i++) {//bucle for que itera la lista de paises e imprime el nomnre
                        Country country1 = countries.get(i);

                        System.out.println(country1.getName().toString());
                    }


                    System.out.println("Lista de paises:");
                    for (int i = 0; i < countries.size(); i++) {//bucle for que itera la lista de paises e imprime el nomnre y datos del pais

                        Country country2 = countries.get(i);
                        System.out.println("____________________________________________");
                        System.out.println(country2.getName()+" :");
                        System.out.println("    Capital: " + country2.getCapital());
                        System.out.println("    Region: " + country2.getRegion());
                        System.out.println("    Population: " + country2.getPopulation());
                        System.out.println("____________________________________________");
                    }

                    System.out.println("Lista de paises filtrados por region: (Europa)");

                    List<Country> europeanCountries = countries.stream()//creamos una lista que almacena los paises de la lista de paises que coincidan con la condicion de que su region sea equals a Europe
                            .filter(country -> country.getRegion().equals("Europe"))
                            .collect(Collectors.toList());
                    for (int i = 0; i < europeanCountries.size(); i++) {//bucle for que itera la lista de paises ya filtrados por region e imprime el nombre y datos del pais filtrando por region
                        System.out.println(europeanCountries.get(i).getName());
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