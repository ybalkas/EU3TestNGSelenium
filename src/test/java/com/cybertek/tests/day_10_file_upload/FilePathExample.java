package com.cybertek.tests.day_10_file_upload;

public class FilePathExample {

    public void test1() {
        System.out.println(System.getProperty("user.dir"));
        String projectPath=System.getProperty("user.dir");
        String filePath="src/test/resources/textfile.txt";
        String fullPath=projectPath+"/"+filePath;
        System.out.println("fullPath = " + fullPath);
    }
}
