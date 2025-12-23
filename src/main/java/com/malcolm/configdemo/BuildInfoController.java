package com.malcolm.configdemo;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RefreshScope
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
		return "Build Id: " + buildInfo.getId() + "<br>" + "Build Version: " + buildInfo.getVersion() + "<br>"
				+ "Build Name: " + buildInfo.getName() + "<br>" + "Build Type: " + buildInfo.getType();
	}

}
