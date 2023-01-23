package FoodFacts;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class OpenFoodFactsService {
    private static OpenFoodFactsApi api = null;
    public static OpenFoodFactsApi getApi() {
        if (api == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://world.openfoodfacts.org/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
            api = retrofit.create(OpenFoodFactsApi.class);
        }
        return api;
    }
}




