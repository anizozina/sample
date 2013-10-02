public class SampleProduct {
 public static void main(String[] args) {
  int[] numberArray = {10,15,18,5,2};
  int number = 1;
  for(int i : numberArray){
   number *= i;
  }
  System.out.println(number);
 }
}



