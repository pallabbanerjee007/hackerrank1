public class Main
{
  static String originalString="abcabc";
  
  private static int operationCount(String word, int input1,int input2){
        
      /*write your code here and return appropriate value*/
    int count = 0;
    String originalWord = word; 
    int length = word.length();
    while(input1 < length && input2 < length) {
    for(int i=0;i<500;i++) {
      
    word = word.substring(length-input1, length).concat(word.substring(0, length-input1));
    word = word.substring(length-input2, length).concat(word.substring(0, length-input2));
      count ++;
    if(originalWord.compareTo(word) == 0) {
    return count;
    }
    }
    
    return 0;
    
  }
  
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
     originalString=args[0];
    System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
  }
}
