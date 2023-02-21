import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
import java.time.format.*;
interface Func1 {
  boolean call(int x);
}
interface Func2 {
  String call(boolean male, String name);
}
public class Main {
  public static void main(String[] args){
    Func1 f1 = x -> x % 2 == 1;
    Func2 f2 = (male, name) -> {
    if(male == true) {return "Mr." + name;}
    else{return "Ms." + name;}
  };
    System.out.println(f1.call(2));
    System.out.println(f2.call(true, "Gota"));
  }
}

// public class FuncList {
//   public static boolean isOdd(int x) {return x % 2 == 1;}
//   public String addNamePrefix(boolean male, String name) {
//     if(male == true) {return "Mr." + name;}
//     else{return "Ms." + name;}
//   }
// }