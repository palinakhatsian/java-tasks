import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class znakiSlowa {
  int liczbznak;
  int liczbSpacje;
  int liczbSlowa;

  void liczZnakiSlowa(File myObj) throws FileNotFoundException{
      Scanner myReader  = new Scanner(myObj);
      while (myReader.hasNextLine()){
          String data =  myReader.nextLine();
          liczbznak += data.length();
          char[] dataChar = data.toCharArray();{
              for(int i = 0; i <data.length; ){

              }

          }
      }
  }
}
