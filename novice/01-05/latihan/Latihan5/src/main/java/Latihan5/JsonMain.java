package Latihan5;
import com.google.gson.Gson;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonMain {

    public static void main(String[] args) {

        try {
        JsonObject obj = new JsonObject();
        obj.setNama("Maulana");
        obj.setUmur(20);
        obj.setAlamat("Tanggerang");

        Gson gson = new Gson();
        String JsonKu = gson.toJson(obj);

        System.out.println(JsonKu);

        List<JsonObject> s = new ArrayList<>();
        s.add(obj);


            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("FileJson.xml")));
            x.writeObject(s);
            x.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.java.Latihan5.SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
