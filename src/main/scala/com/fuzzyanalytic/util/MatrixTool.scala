package com.fuzzyanalytic.util

import breeze.linalg.{DenseMatrix, Matrix}
import org.apache.spark.ml.linalg.Matrices

object MatrixTool {
  def creatMatrix(rows: Int,cols:Int)={
    val m=DenseMatrix.zeros[Double](rows,cols)
    m


  }



}
