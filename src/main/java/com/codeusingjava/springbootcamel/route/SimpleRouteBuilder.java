package com.codeusingjava.springbootcamel.route;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C://Buna//Development//Demo Examples//spring-boot-camel//src//data//folder1").to("file:C://Buna//Development//Demo Examples//spring-boot-camel//src//data//folder2");
	}
}
