package com.knowledgekart.spark_learning.context;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class ContextProvider extends JavaSparkContext {
	ContextProvider(SparkConf conf, String snapshot) {
		super(conf);
		addJar("./target/spark_learning-0.0.1-SNAPSHOT.jar");
	}
	
	public String printContext(){
		System.out.println("App Name is:"+this.appName());
		return "";
	}
}
