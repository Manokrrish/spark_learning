package com.knowledgekart.spark_learning.functions.map;

import org.apache.spark.api.java.function.Function;

public class AddNumber implements Function<Integer, Integer>{
	
	private int constantVal=10;

	public Integer call(Integer in) throws Exception {
		return in+constantVal;
	}

}
