package com.knowledgekart.spark_learning;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.knowledgekart.spark_learning.context.ContextProvider;
import com.knowledgekart.spark_learning.functions.map.AddNumber;
import com.knowledgekart.spark_learning.functions.map.FilterNumber;
import com.knowledgekart.spark_learning.functions.reduce.AddTogether;

@Component("appManager")
public class AppManager {
	
	@Autowired
	private ContextProvider sparkContext;
	
	public void startJob() {
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
		JavaRDD<Integer> distData = sparkContext.parallelize(data, 2);
		FilterNumber fNumber = new FilterNumber();
		JavaRDD<Integer> gRdd = distData.filter(fNumber);
		AddNumber mapObject = new AddNumber();
		JavaRDD<Integer> mapData = gRdd.map(mapObject);
		System.out.println("Creating instance of Together");
		AddTogether add = new AddTogether();
		System.out.println("=== Created ===");
		int total = mapData.reduce(add);
		System.out.println("Total:"+total);
		
	}
}
