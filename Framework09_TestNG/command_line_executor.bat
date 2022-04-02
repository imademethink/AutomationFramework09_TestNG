dir /s /B *.java > sources.txt
set CLASSPATH=D:\TonyStark\Framework09_TestNG\external_jar\testng\*;D:\TonyStark\Framework09_TestNG;D:\TonyStark\Framework09_TestNG\bin;
RMDIR /Q/S bin
MKDIR bin
javac @sources.txt -d bin
java -cp %CLASSPATH% org.testng.TestNG -d test-output  testng.xml
java -cp %CLASSPATH% org.testng.TestNG -d test-output2 test-output\testng-failed.xml
