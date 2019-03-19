package data.remote;

public class ApiUtils {
    //public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public ApiUtils() {
    }

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/post";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
    public static APIService getAPIService()
    {
      return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
