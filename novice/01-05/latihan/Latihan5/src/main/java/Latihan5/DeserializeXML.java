package main.java.Latihan5;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeserializeXML {
    public static void main(String[] args) {
        try {
            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("MyCollage.xml")));
            main.java.Latihan5.Collage c = (main.java.Latihan5.Collage)x.readObject();

            List<main.java.Latihan5.Student> s = c.getStudents();

            for (main.java.Latihan5.Student value : s){
                System.out.println(value);
            }

        } catch (FileNotFoundException ex ) {
            Logger.getLogger(DeserializeXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
