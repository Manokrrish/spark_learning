package com.knowledgekart.spark_learning.functions.reduce;

import org.apache.spark.api.java.function.Function2;

public class AddTogether implements Function2<Integer, Integer, Integer> {


	public Integer call(Integer in1, Integer in2) throws Exception {
		return in1+in2;
	}

}
