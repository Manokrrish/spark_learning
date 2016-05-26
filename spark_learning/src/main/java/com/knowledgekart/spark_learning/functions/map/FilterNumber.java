package com.knowledgekart.spark_learning.functions.map;

import org.apache.spark.api.java.function.Function;

public class FilterNumber implements Function<Integer, Boolean>{

	public Boolean call(Integer in) throws Exception {
		if(in>3) {
			return true;
		} else {
			return false;
		}
	}

}
