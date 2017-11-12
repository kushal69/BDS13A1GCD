package com

object GCD {

  def gcd(firstInput: Int, secondInput: Int): Int = {
    if (secondInput != 0) {
      gcd(secondInput, firstInput % secondInput);
    } else {
      firstInput;
    }
  }

  def main(args: Array[String]) {

    println("Enter values for calculating GCD → ");

    // Taking input from user
    print("First Value : ");
    val firstInput = scala.io.StdIn.readInt();

    print("Second Value : ");
    val secondInput = scala.io.StdIn.readInt();

    println("GCD is of " + firstInput + " and " + secondInput + " is : "
      + gcd(firstInput, secondInput));

  }
}