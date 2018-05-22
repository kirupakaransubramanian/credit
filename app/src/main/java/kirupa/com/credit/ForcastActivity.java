package kirupa.com.credit;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForcastActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ForecastPojo> userListResponseData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forcast);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        getUserListData(); // call a method in which we have implement our GET type web API
    }

    private void getUserListData() {
        // display a progress dialog
        final ProgressDialog progressDialog = new ProgressDialog(ForcastActivity.this);
        progressDialog.setCancelable(false); // set cancelable to false
        progressDialog.setMessage("Please Wait"); // set message
        progressDialog.show(); // show progress dialog


        (Api.getClient().getForecast()).enqueue(new Callback<ForecastPojo>() {
            @Override
            public void onResponse(Call<ForecastPojo> call, Response<ForecastPojo> response) {
                Log.d("insertManagerDrivers", String.valueOf(response.body().getCity()));
            }

            @Override
            public void onFailure(Call<ForecastPojo> call, Throwable t) {

            }


        });
    }
//    public static void insertManagerDrivers(List<ForecastPojo.CityBean> cityBeanList, Context applicationContext) {
//        Log.d("insertManagerDrivers", " DrtiverTable");
//
//        for (ForecastPojo.CityBean user : cityBeanList) {
//
//            Log.d("insertManagerDrivers", user.getCountry());
//
//        }
//
//    }

//    private void setDataInRecyclerView() {
//        // set a LinearLayoutManager with default vertical orientation
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ForcastActivity.this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        // call the constructor of UsersAdapter to send the reference and data to Adapter
//        UsersAdapter usersAdapter = new UsersAdapter(ForcastActivity.this, userListResponseData);
//        recyclerView.setAdapter(usersAdapter); // set the Adapter to RecyclerView
//    }
}


