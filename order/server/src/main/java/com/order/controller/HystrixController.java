package com.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {


	@HystrixCommand
	@GetMapping("/getProductInfoList")
	public String getProductInfoList(@RequestParam("number") Integer number) {
		if (number % 2 == 0) {
			return "success";
		}

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject("http://127.0.0.1:8005/product/listForOrder",
				Arrays.asList("157875196366160022"),
				String.class);

	}

	private String fallback() {
		return "please try it later";
	}

	private String defaultFallback() {
		return "please try it later";
	}
}
