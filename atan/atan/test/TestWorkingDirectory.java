package atan.test;

import java.io.*;

public class TestWorkingDirectory {

  public static void main(String[] args) {
    try {
      File f = new File(".");
      System.out.println("Your working directory.");
      System.out.print("AbsolutePath:'");
      System.out.print(f.getAbsolutePath());
      System.out.println("'");
      System.out.print("CanonicalPath:'");
      System.out.print(f.getCanonicalPath());
      System.out.println("'");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}