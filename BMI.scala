/*
5. Given that the body mass index (BMI) is weight in kilograms divided by the height in meters
squared(kg/height*height). If you have a BMI of less than 18.5,
you are underweight, between 18.5 - 24.9 is normal weight,
BMI of 25 and higher is overweight. Write a BMI function that satisfies the
following:
*/

class BodyMassIndex{

  def bmiStatus(bmi: Double): String = {

    var myStatus = ""
    
    if bmi < 18.5 then myStatus = "You are underweight"
    else if bmi >= 18.5 && bmi <= 24.9 then myStatus = "Normal weight"
    else if bmi >= 25 then myStatus = "Overweight"

    return myStatus
    
  }//end of function
  
}//end of class

object BMI{
  def main(args: Array[String]): Unit = {

    val bmi: BodyMassIndex = new BodyMassIndex()
    val normal = bmi.bmiStatus(160.68)

    assert("Normal weight" == normal, "Expected normal weight, Got "+ normal)
    
  }//end of main
}//end of object
