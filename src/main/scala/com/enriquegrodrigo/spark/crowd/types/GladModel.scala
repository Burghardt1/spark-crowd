
package com.enriquegrodrigo.spark.crowd.types

import org.apache.spark.sql.Dataset
import org.apache.spark.broadcast.Broadcast


case class GladModel(dataset: Dataset[BinarySoftLabel], 
                      params: GladParams, logLikelihood: Double)
