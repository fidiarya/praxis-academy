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




