package Latihan5;
import org.json.*;
import com.google.gson.Gson;

public class JsonMain {

    public static void main(String[] args) {
        JsonObject obj = new JsonObject();
        obj.setNama("Maulana");
        obj.setUmur(20);
        obj.setAlamat("Tanggerang");

        Jso gson = new JSONObject();
        JSONArray JsonKu = gson.toJson(obj);

        System.out.println(JsonKu);
    }

}
