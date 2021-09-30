package com.company.tomtom.hackathon;

import java.io.IOException;

final class FileExist {

    public static void main(String[] args) throws IOException {
//        File file = new File("test.txt");
//        System.out.println(file.exists());
//        file.createNewFile();
//        System.out.println(file.exists());
        my_recursive_function(10);
    }



    static void my_recursive_function(int n)
    {
        if(n == 0)
            return;
        my_recursive_function(n-1);
        System.out.println(n);
    }


}
