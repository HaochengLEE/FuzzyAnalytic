package com.fuzzyanalytic

import breeze.linalg.{DenseMatrix, DenseVector, Matrix, eigSym}
import com.fuzzyanalytic.util.MatrixTool

object MatrixTest {
  def main(args: Array[String]): Unit = {
//    val B:Matrix = Matrix(2,2,Array((1,2),(3,4)))
val A= DenseVector.zeros[Double](5)
//val m= MatrixTool.creatMatrix(4,4)
val B= DenseMatrix.zeros[Double](2,2)
//    val es = eigSym(A)
//    val A=100
    println(A)

    println("=================")

    println(B)


  }

}
