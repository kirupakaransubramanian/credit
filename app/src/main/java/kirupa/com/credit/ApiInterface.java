package kirupa.com.credit;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

/**
 * Created by kirupa on 4/5/18.
 */

public interface ApiInterface {

    @FormUrlEncoded // annotation used in POST type request
//    @GET("jsonActors")
//        // API's endpoints
//    Call<UserListResponse_withImage> getUsersListWithImage();


    @GET("forecast?q=Chennai,IN&mode=json&appid=57e41e5a239fb1241558481b38e19e4d")
    Call<ForecastPojo> getForecast();
}