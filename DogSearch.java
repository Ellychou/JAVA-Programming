public class DogSearch
{
 public static void main(String[] args)
  {
    //This code will not compile correctly until you fix it.
    //
    //We are trying to count the number of times the word
    //dog appears in some input text, but we can't seem to
    //remember the appropriate method call in the String class,
    //and are not sure our approach will work.
    //task: Use the JDK documentation to help us finish the code,
    //then discuss the ambiguity in the problem description, and
    //reword it to remove the ambiguity in the space provided below.
    //
    //Ambiguity:
    //1. Is "dog" case-sensitive? In the following code, we assume yes, and we do not count "Dog".
    //2. Should we count the word which contains "dog", such as "hotdogs", "dog-like"? We also assume yes as we count "dog-like" and "hotdogs"
    //
    //I will reword the problem as"Count the number of times the word dog in some input text. 
    //The word dog is case-sensitive, so do not count the dog with any Capital character such as "Dog" or "dOg". 
    //But count the word which contains "dog"."
    //

    String input = new String("The Dogman was no ordinary dog, nor man, but rather a peculiar dog-like man who barked like a dog, and panted like a dog, he even ate like a dog.  He owned a dog named Doglips, and interestingly enough, his favorite food was hotdogs.");
    System.out.println(input);
    int index = -3;//Changed the index from -1 to -3, so at first it will search from the first character in the string
    int count = 0;
    System.out.print("Counting dogs:");
    do{
      index = input.indexOf("dog",index+3); //if it finds the word of "dog", it will return the index of the "d" in the "dog".
      //if "dog" could not be found, it will return -1. I have add "index+3" as parameter, so if it finds a "dog"， next time it will search the substring which is after this "dog".
      if(index != -1){
        count++;
        System.out.print(count+" ");
      }
    }while(index != -1);
    System.out.println("The word \"dog\" appears "+count+" times.");
  } 
}



