package com.company;

//convert string to ascii and store it in a file

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("ascii.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = sc.nextLine();

        char [] arr = string.toCharArray();
        int [] ascii = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++)
        {
            ascii[i] = arr[i];
        }

        System.out.println("Converted ascii : ");
        for(int i : ascii)
        {
            System.out.print(i + " ");
        }

        for(int i : ascii)
        {
            bufferedWriter.write(i + " ");
        }
        bufferedWriter.write("\n");

        bufferedWriter.close();
        fileWriter.close();

    }
}
