public class Compiling {
    public static void main(String[] args) {
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
  
      System.out.println("Programming is... fun!");
      
    }
  }
  
//terminal commands:

  /*
   * $ ls
Compiling.java
$ javac Compiling.java
$ javac Compiling.java
$ ls
Compiling.class  Compiling.java
$ java compiling
Error: Could not find or load main class compiling
Caused by: java.lang.ClassNotFoundException: compiling
$ java Compiling
Java is a class-based language.
Java classes have a 'main' method.
Java statements end with a semicolon.
Programming is... fun!
   */
