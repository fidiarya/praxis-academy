membuat dalam bentuk executable.jar 

1. buat sebuah folder baru untuk project gradle
2. klik kanan pada folder tersebut masuk ke git bash 
3. kemudian ketik perintah : gradle init
4. pilih : 2. aplication 
5. pilih : 3. java 
6. pilih : 1. groovy
7. pilih : 1. JUnit 4 
8. beri nama project anda 
9. kemudian ketik : code . : untuk membuka vs. code 
10. buka folder project anda : src/main/java/projekanda 
11. kemudian pilih file projek anda 
12. buka terminal : gradle run 
13. dan kemudian untuk file jar buatlah code 
jar{
    manifest{
        attributes 'Main-Class' : 'project.File'
    }
} 
14. kemudian ketik perintah : java -jar .\build\libs\FileProject.jar 
15. selesai