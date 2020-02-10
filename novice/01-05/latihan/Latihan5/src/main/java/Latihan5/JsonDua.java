package Latihan5;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonDua {
    public static void main(String[] args) {
        // buat json object root
        JSONObject jsonObjectRoot = new JSONObject();

        // isi nilai nama ke json root
        jsonObjectRoot.put("nama", "Yudi Setiawan");

        // isi nilai hobi ke json root
        JSONArray jsonArrayHobi = new JSONArray();
        jsonArrayHobi.add("menulis");
        jsonArrayHobi.add("membaca");
        jsonArrayHobi.add("bersepeda");
        jsonObjectRoot.put("hobi", jsonArrayHobi);

        // isi nilai usia ke json root
        jsonObjectRoot.put("usia", 23);

        // buat json object orang tua
        JSONObject jsonObjectOrangTua = new JSONObject();

        // buat json object ibu dan isi ke json root
        JSONObject jsonObjectIbu = new JSONObject();
        jsonObjectIbu.put("nama", "Rosmaini");
        jsonObjectRoot.put("ibu", jsonObjectIbu);

        // buat json object ayah dan isi ke json root
        JSONObject jsonObjectAyah = new JSONObject();
        jsonObjectAyah.put("nama", "Mardi");
        jsonObjectRoot.put("ayah", jsonObjectAyah);

        // testing tampilkan nilai yang sudah dimasukkan ke json object root
        System.out.println("jsonObjectRoot: " + jsonObjectRoot.toJSONString());
    }

}
}
