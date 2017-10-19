//---------->Implementation of Sieve of Eratosthenes method<----------


object PRIME {
  
  
   def main(args: Array[String]){                //main
     
     println("---------->Implementation of Sieve of Eratosthenes method<----------");
     println();
     println("Enter the maximum value to which you want calculate prime numbers:");
     val num=readInt();     
          println();
     val list=List.range(2,num+1); //crating a list from 2 to num
     println("List is: " + list);
     
     println("Required List of Prime numbers is: " + filter(list))      
  def filter(x: List[Int]) = {
  def SofEMethod(LIST: List[Int]): List[Int] =
  if (LIST.isEmpty) LIST                                           //base condition
  else LIST.head :: SofEMethod(LIST.tail filter(_% LIST.head != 0))          //marked the multiple of p and filter them 
SofEMethod(x);           //last statement
}
   }
}