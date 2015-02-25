public class PrimesImprovement
{
  public static void main(String[] args)
  {
 
    //This code should print out the prime numbers.
    //task: Fix and improve the algorithm
    
    System.out.println("Printing primes from 1 to 100");
    int i;
    int j;
    boolean prime;
    for(i = 1; i <= 100; i++)
    {
      prime = true;
      for(j = 2; j < i; j++)//Change the start index from 1 to 2, beacasue all the number % 1 will equal to 0. 
        if(i%j == 0) {
          prime = false; 
          break;//once it is not prime, it does not need to check other numbers.
        }


      if(prime) System.out.print(i+" ");
    }
    System.out.println();
  }
}


