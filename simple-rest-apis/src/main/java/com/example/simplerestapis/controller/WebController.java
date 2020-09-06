package com.example.simplerestapis.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.simplerestapis.models.PostRequest;
import com.example.simplerestapis.models.PostResponse;
import com.example.simplerestapis.models.PricingRequest;
import com.example.simplerestapis.models.PricingResponse;
import com.example.simplerestapis.models.RegisterRequest;
import com.example.simplerestapis.models.SampleResponse;
import com.example.simplerestapis.models.registerResponse;

@RestController
public class WebController {
	
	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name",defaultValue = "Robot") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+name);
		return response;

	}
	
	@RequestMapping(value = "/quote", method = RequestMethod.POST)
	public PricingResponse customer(@RequestBody PricingRequest inputPayload) {
		PricingResponse response = new PricingResponse();
		int tonnes = Integer.parseInt(inputPayload.getNumberOfTonnes());
		response.setPrice(60*tonnes*1000);
		return response;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest inputPayload) {
		PostResponse response = new PostResponse();
		response.setId(inputPayload.getId()*100);
		response.setMessage("Hello " + inputPayload.getName());
		response.setExtra("Some text");
		return response;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public registerResponse Test(@RequestBody RegisterRequest inputPayload) {
		registerResponse response = new registerResponse();
		response.setMessage("Thanks you for Registering "+inputPayload.getFirstName());
		return response;
	}

}
