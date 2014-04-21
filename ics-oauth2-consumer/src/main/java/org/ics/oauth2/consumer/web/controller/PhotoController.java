package org.ics.oauth2.consumer.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/photo")
public class PhotoController {
	private final Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(params = "method=listPhotos")
	@ResponseBody
	public String listPhotos() {
		logger.info("before invoke listPhotos...");
		// to do
		logger.info("after invoke listPhotos...");
		return "testtttt";
	}

}
