package com.danielyli.gitplayground

object Application {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    if (args.nonEmpty) {
      println("\nYou have entered the following arguments:")
      args.foreach(println)
    }
  }
}
