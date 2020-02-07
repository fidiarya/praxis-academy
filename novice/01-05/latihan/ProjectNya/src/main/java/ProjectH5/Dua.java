package ProjectH5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * @author Eko Kurniawan Khannedy
 */
public class Dua {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();

        // membuat dokumen
        Document document = builder.newDocument();

        // membuat root element
        Element root = document.createElement("perusahaan");
        document.appendChild(root);

        // membuat karwayan 1
        Element karwayan1 = document.createElement("karyawan");
        karwayan1.setAttribute("nip", "10106031");
        root.appendChild(karwayan1); // tambahkan ke root

        // membuat nama karyawan 1
        Element nama1 = document.createElement("nama");
        nama1.appendChild(document.createTextNode("Eko"));
        karwayan1.appendChild(nama1);

        // membuat email karyawan 1
        Element email1 = document.createElement("email");
        email1.appendChild(document.createTextNode("eko@gmail.com"));
        karwayan1.appendChild(email1);

        // membuat karwayan 2
        Element karwayan2 = document.createElement("karyawan");
        karwayan2.setAttribute("nip", "10106032");
        root.appendChild(karwayan2); // tambahkan ke root

        // membuat nama karyawan 2
        Element nama2 = document.createElement("nama");
        nama2.appendChild(document.createTextNode("Khannedy"));
        karwayan2.appendChild(nama2);

        // membuat email karyawan 2
        Element email2 = document.createElement("email");
        email2.appendChild(document.createTextNode("khannedy@gmail.com"));
        karwayan2.appendChild(email2);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("perusahaan.xml"));

        transformer.transform(source, result);
    }

}