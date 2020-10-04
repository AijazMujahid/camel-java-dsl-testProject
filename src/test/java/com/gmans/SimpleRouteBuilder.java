package com.gmans;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:F:/ApacheCamelPractice/inputFolder").to("file:F:/ApacheCamelPractice/outputFolder");
	}

}
