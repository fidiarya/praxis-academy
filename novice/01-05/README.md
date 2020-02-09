hari ke 5

1. Serialization and Deserialization 

Serialization adalah salah satu proses yang digunakan di dalam bahasa pemrograman Java , untuk  memproses atau mengubah atribut dari sebuah objek menjadi byte stream atau bisa disebut juga urutan bit ,sehingga kita dapat menyimpanya lewat file-file komputer ,dan memori ,serta juga lewat koneksi jaringan.
contoh :

//import librarynya 
import java.io.*;

try (FileOutputStream file = new FileOutputSteram(lokasi)){
	
    //mengkonversi ke byte stream
	ObjectOutputStream output = new ObjectOutputSream(file);
	output.writeObject(person);
	output.close();	
	
    System.out.println("data berhasil di simpan");
} catch (IOExeception e){
	System.out.println("data gaga di simpan");
}

Deserialization, yang  dimana proses ini merupakan kebalikan dari Serialization , yang berfungsi mengubah byte stream ke dalam sebuah objek yang dapat digunakan kembali.
contoh : 

//import librarynya
import java.io.*;

try (FileInputStream fileInput = new FileInputStraem(lokasi)){
    //mengubah byte stream ke object kembali 
    ObjectInputStraem input = new ObjectInputStream(fileInput);

    //melakukan proses downcasting objek
    Person person = (person) input.readObject();
    input.close();

    // tampilkan output hasilnya 
    System.out.println(person.methodDatanya());

} catch (IOException e) {
    System.out.println("data gagal di tampilkan");
}

2. XML
XML adalah bahasa berbasis teks sederhana yang dirancang untuk menyimpan dan mengangkut data dalam format teks biasa. Itu adalah singkatan dari Extensible Markup Language. Berikut ini adalah beberapa fitur penting XML:
- XML adalah bahasa markup.
- XML adalah bahasa berbasis tag seperti HTML.
- Tag XML tidak ditentukan sebelumnya seperti HTML.
- Anda dapat mendefinisikan tag Anda sendiri dan oleh karena itu disebut tag bahasa yang dapat dikembangkan.
- Tag XML dirancang untuk bersifat deskriptif sendiri.
- XML adalah W3C Recommendation untuk penyimpanan data dan transfer data.

Java Parsing : 
Dom Parser - Mem-parsing dokumen XML dengan memuat konten lengkap dokumen dan membuat hierarki pohon lengkap dalam memori. 
Parser SAX - Parsing dokumen XML pada pemicu berbasis acara. Tidak memuat dokumen lengkap ke dalam memori.
JDOM Parser - Parsing dokumen XML dengan cara yang mirip dengan parser DOM tetapi dengan cara yang lebih mudah.
StAX Parser - Parsing dokumen XML dengan cara yang mirip dengan SAX parser tetapi dengan cara yang lebih efisien.
XPath Parser - Parsing dokumen XML berdasarkan ekspresi dan digunakan secara luas bersama dengan XSLT.
DOM4J Parser - Pustaka java untuk mem-parsing XML, XPath, dan XSLT menggunakan Java Collections Framework. Ini memberikan dukungan untuk DOM, SAX, dan JAXP.

DOM 

Beberapa Method DOM :
Document.getDocumentElement () - Mengembalikan elemen root dokumen.

Node.getFirstChild () - Mengembalikan anak pertama dari Node yang diberikan.

Node.getLastChild () - Mengembalikan anak terakhir dari Node yang diberikan.

Node.getNextSibling () - Metode ini mengembalikan saudara berikutnya dari Node yang diberikan.

Node.getPreviousSibling () - Metode ini mengembalikan saudara sebelumnya dari Node yang diberikan.

Node.getAttribute (attrName) - Untuk Node yang diberikan, ia mengembalikan atribut dengan nama yang diminta.

langkah-langkah yang digunakan saat mem-parsing dokumen menggunakan JDOM Parser:

- Impor paket terkait XML.
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
- Buat SAXBuilder.
DocumentBuilderFactory factory =
DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
- Buat Dokumen dari file atau aliran
StringBuilder xmlStringBuilder = new StringBuilder();
xmlStringBuilder.append("<?xml version="1.0"?> <class> </class>");
ByteArrayInputStream input = new ByteArrayInputStream(
   xmlStringBuilder.toString().getBytes("UTF-8"));
Document doc = builder.parse(input);
- Ekstrak elemen root
Element root = document.getDocumentElement();
- Periksa atribut
//returns specific attribute
getAttribute("attributeName");
//returns a Map (table) of names/values
getAttributes();
- Periksa sub-elemen
//returns a list of subelements of specified name
getElementsByTagName("subelementName");
//returns a list of all child nodes
getChildNodes();
- Impor paket terkait XML


3. JSON
JSON merupakan singkatan dari JavaScript Object Notation dimana, ini adalah suatu format data yang berfungsi untuk melakukan komunikasi pertukaran data. Berdasarkan situsnya disebutkan.
Format di JSON ada beberapa format dasar yang perlu Anda pahami terlebih dahulu yaitu sebagai berikut:
Object {}
Array []
String ""
Number "long":"10" / "doble":"10.2"
Boolean "anu":"true / false"
Null "anu":"null"

contoh :
{
  "nama": "Arya",
  "usia": 24,
  "email": "fidiarya@gmail.com",
  "website": [
    {
      "url": "https://www.fidiarya.blogspot.com",
      "description": "Bloger"
    },
    {
      "url": "https://www.anu.co.id",
      "description": "anu "
    }
  ],
  "social_media": [
    {
      "url": "https://www.facebook.com/fidiarya",
      "description": "facebook"
    },
    {
      "url": "https://github.com/fidiarya",
      "description": "github"
    },
    {
      "url": "https://google.com",
      "description": "googling"
    }
  ]
}

4. JAVA Data Struktur


5. 6 Data Struktur Java
- Array
- Linked List
- Hash Table
- Stack 
- Queue
- Set







