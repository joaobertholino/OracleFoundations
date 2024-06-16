package application;

public class App {

  public static void main(String[] args) {
//    byte myByteError = 128;

    short myShort = 128;
    byte shortToByte = (byte) myShort;
    System.out.println(shortToByte);
    
    byte myByte = 127;
    myByte++;
    System.out.println(myByte);
    myByte++;
    System.out.println(myByte);
  }
}
