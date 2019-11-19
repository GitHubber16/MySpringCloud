package com.shankho.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shankho.microservices.limitsservice.bean.LimitConfiguration;

@RestController
@Configurable
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
