/*
6. Create an anonymous function or a lambda expression with three
arguments(temperature,low, and high). 
The anonymous function will return true if the temperature is between high and low,
and false otherwise. Assign the anonymous function to a def and then call your function. Satify the
following.
*/

class CheckTemperature{
  
  val temp = (temperature :Double, low: Double, high: Double) => {
    if temperature >= low && temperature <= high then true
    else false
  }//end of temp
  
}//end of class

object Temperature{
  def main(args : Array[String]): Unit = {
    val temperature:CheckTemperature = new CheckTemperature()
    
    val temp = temperature.temp(70,80,90)
    
    if(temp){
      println("Temperature is between low and high")
    }//end if
    else{
      println("Temperature is not between low and high")
    }//end else
    

    val temp2 = temperature.temp(70,60,90)
    if(temp2){
      println("Temperature is between low and high")
    }//end if
    else{
      println("Temperature is not between low and high")
    }//end else
    
  }//end of main function
}//end of object
