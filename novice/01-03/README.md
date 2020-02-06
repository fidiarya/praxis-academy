1. Annotations 
merupakan suatu tag untuk memberikan informasi pada suatu kode berperilaku seperti meta tag, banyak sekali penggunaan annotation pada applikasi java misalnya saja pada java persistence bahkan servlet 3.0 sekarang sudah  mendukung annotation ini, penambahan annotation ini tidak akan berdampak langsung pada kode program.

Secara umum kegunaan annotation adalah sebagai berikut :

Memberikan informasi kepada compiler -> Annotation dapat digunakan oleh compiler untuk mendeteksi error atau suppress warning.
Compiler-time dan deployment-time processing -> Software tools dapat memproses informasi dari annotation untuk men-generate code, XML file, dan masih banyak lagi.
Runtime processing -> Beberapa annotation akan diperiksa pada waktu runtime.
contoh : 
@Overide
membuat kode dapat dibaca dan menghindari masalah pemeliharaan, seperti: saat mengubah metode tanda tangan dari kelas induk, Anda harus mengubah tanda tangan di kelas anak (di mana anotasi ini sedang digunakan) jika kompiler akan membuat kesalahan kompilasi
@Deprecated
Anotasi Deprecated ialah anotasi yang di gunakan untuk mendokumentasi bahwa method itu lawas / lama
 * yang tidak di gunakan lagi
@SuppressWarnings
Anotasi SuppressWarnings adalaha anotasi yang di gunakan untuk menginformasikan bahwa method lama di gunakan lagi agar memerintahkan kompiler menampilkan peringatan khusus

2. javaDoc adalah sebuah alat untuk mengekstrak informasi dari source file java untuk membuat sebuah API 
contoh : 
**/ coment /** 
@version 
@user

3. Generic
Generic dikenal juga sebagai tipe data berparameter (parameterized types), yaitu tipe data yang biasanya didefinisikan di bagian argumen/parameter dan bersifat generik atau dikenali pada saat runtime. 

