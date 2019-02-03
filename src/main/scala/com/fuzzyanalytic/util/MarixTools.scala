package com.fuzzyanalytic.util
import breeze.linalg.{DenseMatrix, Matrix}
import org.apache.spark.ml.linalg.Matrices

class MarixTools {
  def creatMatrix(rows: Int,cols:Int)={
    val m=DenseMatrix.zeros[Double](rows,cols)


  }
//
//  def creatMatrix(): Unit ={
//    val cMatrix = Matrices.dense(2,2,Array{1,2,3,4})
//
//  }
//
//  def creatDenseMatrix()={
//    val a = DenseMatrix((1,2),(3,4))

//  }

//  def transposition(matrix: Matrix)={
//    a(4,::)
//  }


//  val x1=List{{5+7},{1+3}}

}
