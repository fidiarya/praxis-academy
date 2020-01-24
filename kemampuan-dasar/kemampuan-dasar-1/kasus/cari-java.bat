@echo off
cls
:start
echo mencari file .java 
dir /b/s *.java 
echo file .java ada pada direktori 
pwd
echo apakah anda ingin merubah nama file?
set /p pilihan=pilih y/n : 
if %pilihan% == y GOTO y
if %pilihan% == n GOTO n
:y
set /p nama=masukkan nama :  
ren *.java %nama%.java
echo data berhasil di rubah...
echo.
:n 
exit 
