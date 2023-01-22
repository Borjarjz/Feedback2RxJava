package Countries;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class CountriesController {

    @FXML
    private ListView<String> countriesListView;

    private CountriesApi api = CountriesService.getApi();
    private ObservableList<String> countries = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        countriesListView.setItems(countries);
        api.getCountries()
                .enqueue(new Callback<List<Country>>() {
                    @Override
                    public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                        if (response.isSuccessful()) {
                            for (Country country : response.body()) {
                                countries.add(country.getName());
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