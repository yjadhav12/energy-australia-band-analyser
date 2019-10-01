import io.swagger.client.api.FestivalsApi;
import io.swagger.client.model.MusicFestival;

import java.util.List;

public class ReformatRespApiService {

    public static void main(String[] args) {

        FestivalsApi apiInstance = new FestivalsApi();
        try {
            List<MusicFestival> result = apiInstance.aPIFestivalsGet();
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling FestivalsApi#aPIFestivalsGet");
            e.printStackTrace();
        }
    }

}
