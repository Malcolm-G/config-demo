package com.malcolm.configdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BuildInfoController {

	/*
	 * @Value("${build.id:default}") private String buildId;
	 * 
	 * @Value("${build.version:default}") private String buildVersion;
	 * 
	 * @Value("${JAVA_HOME}") private String buildName;
	 */
	private final BuildInfo buildInfo;

	@GetMapping("/build-info")
	public String getBuildInfo() {
		return "Build Id: " + buildInfo.getId() + "\nBuild Version: " + buildInfo.getVersion() + "\nBuild Name: "
				+ buildInfo.getName();
	}

}
