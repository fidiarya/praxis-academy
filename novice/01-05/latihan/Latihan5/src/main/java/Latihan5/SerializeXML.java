package main.java.Latihan5;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeXML {

    public static void main(String[] args) {
        main.java.Latihan5.Student st1 = new main.java.Latihan5.Student();
        st1.setRollno(101);
        st1.setName("Roni");

        main.java.Latihan5.Student st2 = new main.java.Latihan5.Student();
        st2.setRollno(102);
        st2.setName("Rini");

        List<main.java.Latihan5.Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);

        main.java.Latihan5.Collage c = new main.java.Latihan5.Collage();
        c.setStudents(s);

        try {
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("MyCollage.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
