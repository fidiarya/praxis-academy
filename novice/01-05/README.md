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

refrensi belajar https://agung-setiawan.com/gson-mengubah-objek-java-menjadi-json/ 
jangan lupa download jsonnya di https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6 . kemudia copas path nya di build.gradle dependancies

4. JAVA Data Struktur
- Enumeration
mendefinisikan metode yang digunakan untuk menghitung (memperoleh satu per satu) elemen dalam kumpulan objek.
methodnya :
> boolean hasMoreElements( )
Ketika diimplementasikan, itu harus mengembalikan true sementara masih ada lebih banyak elemen untuk diekstraksi, dan false ketika semua elemen telah disebutkan.
> Object nextElement( )
Ini mengembalikan objek berikutnya dalam enumerasi sebagai referensi Objek generik.
contoh dari enumeration :
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

   public static void main(String args[]) {
      Enumeration days;
      Vector dayNames = new Vector();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}

Outputnya :
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday

- BitSet
menciptakan tipe array khusus yang menyimpan nilai bit.
Construktornya :
> BitSet()
>BitSet(int size)
Konstruktor ini memungkinkan Anda menentukan ukuran awal, mis., Jumlah bit yang dapat ditampungnya. Semua bit diinisialisasi ke nol.

Methodnya :
void and(BitSet bitSet)
void andNot(BitSet bitSet)
int cardinality( )
void clear( )
void clear(int index)
dll

contoh : 
import java.util.BitSet;
public class BitSetDemo {

  public static void main(String args[]) {
      BitSet bits1 = new BitSet(16);
      BitSet bits2 = new BitSet(16);
      
      // set some bits
      for(int i = 0; i < 16; i++) {
         if((i % 2) == 0) bits1.set(i);
         if((i % 5) != 0) bits2.set(i);
      }
     
      System.out.println("Initial pattern in bits1: ");
      System.out.println(bits1);
      System.out.println("\nInitial pattern in bits2: ");
      System.out.println(bits2);

      // AND bits
      bits2.and(bits1);
      System.out.println("\nbits2 AND bits1: ");
      System.out.println(bits2);

      // OR bits
      bits2.or(bits1);
      System.out.println("\nbits2 OR bits1: ");
      System.out.println(bits2);

      // XOR bits
      bits2.xor(bits1);
      System.out.println("\nbits2 XOR bits1: ");
      System.out.println(bits2);
   }
}

outputnya :
Initial pattern in bits1:
{0, 2, 4, 6, 8, 10, 12, 14}

Initial pattern in bits2:
{1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14}

bits2 AND bits1:
{2, 4, 6, 8, 12, 14}

bits2 OR bits1:
{0, 2, 4, 6, 8, 10, 12, 14}

bits2 XOR bits1:
{}

- Vector
Vektor mengimplementasikan array dinamis. Ini mirip dengan ArrayList, tetapi dengan dua perbedaan :
* Vektor disinkronkan.
* Vektor berisi banyak metode warisan yang bukan bagian dari kerangka kerja koleksi.
Vektor terbukti sangat berguna jika Anda tidak tahu ukuran array di muka atau Anda hanya perlu satu yang dapat mengubah ukuran sepanjang masa program.

Konstruktornya:
> Vector( )
> Vector(int size )
> Vector(int size, int incr )
> Vector(Collection c )

Methodnya :
> void add(int index, Object element) 
> boolean add(Object o)
> boolean addAll(Collection c)
> boolean addAll(int index, Collection c)
> void addElement(Object obj)
> dll

Contohnya :
import java.util.*;
public class VectorDemo {

   public static void main(String args[]) {
      // initial size is 3, increment is 2
      Vector v = new Vector(3, 2);
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());
      
      v.addElement(new Integer(1));
      v.addElement(new Integer(2));
      v.addElement(new Integer(3));
      v.addElement(new Integer(4));
      System.out.println("Capacity after four additions: " + v.capacity());

      v.addElement(new Double(5.45));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Double(6.08));
      v.addElement(new Integer(7));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Float(9.4));
      v.addElement(new Integer(10));
      System.out.println("Current capacity: " + v.capacity());
      
      v.addElement(new Integer(11));
      v.addElement(new Integer(12));
      System.out.println("First element: " + (Integer)v.firstElement());
      System.out.println("Last element: " + (Integer)v.lastElement());
      
      if(v.contains(new Integer(3)))
         System.out.println("Vector contains 3.");
         
      // enumerate the elements in the vector.
      Enumeration vEnum = v.elements();
      System.out.println("\nElements in vector:");
      
      while(vEnum.hasMoreElements())
         System.out.print(vEnum.nextElement() + " ");
      System.out.println();
   }
}

Outputnya :
Initial size: 0
Initial capacity: 3
Capacity after four additions: 5
Current capacity: 5
Current capacity: 7
Current capacity: 9
First element: 1
Last element: 12
Vector contains 3.

Elements in vector:
1 2 3 4 5.45 6.08 7 9.4 10 11 12

- Stack
Stack adalah subclass dari Vector yang mengimplementasikan stack last-in, first-out standar.

Konstruktornya :
> Stack ()

Methodnya :
> boolean empty()
> Object peek( )
> Object pop( )
> Object push(Object element)
> int search(Object element)

Contohnya : 
import java.util.*;
public class StackDemo {

   static void showpush(Stack st, int a) {
      st.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
   }

   static void showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
      showpush(st, 42);
      showpush(st, 66);
      showpush(st, 99);
      showpop(st);
      showpop(st);
      showpop(st);
      try {
         showpop(st);
      } catch (EmptyStackException e) {
         System.out.println("empty stack");
      }
   }
}

Outputnya :
stack: [ ]
push(42)
stack: [42]
push(66)
stack: [42, 66]
push(99)
stack: [42, 66, 99]
pop -> 99
stack: [42, 66]
pop -> 66
stack: [42]
pop -> 42
stack: [ ]
pop -> empty stack

- Dictionary
kelas abstrak yang mewakili penyimpanan kunci / nilai penyimpanan dan beroperasi seperti Peta.

Methodnya :
> Enumeration elements( )
> Object get(Object key)
> boolean isEmpty( )
> vEnumeration keys( )
> Object put(Object key, Object value)
> Object remove(Object key)
> int size( )

- Hashtable
Hashtable adalah bagian dari java.util asli dan merupakan implementasi konkret dari Kamus.

Konstruktornya :
> Hashtable( )
> Hashtable(int size)
> Hashtable(int size, float fillRatio)
> Hashtable(Map < ? extends K, ? extends V > t)

Methodnya : 
> void clear( )
> 
> 
> 
> 

- Properties


5. 6 Data Struktur Java
- Array
- Linked List
- Hash Table
- Stack 
- Queue
- Set

6. 







