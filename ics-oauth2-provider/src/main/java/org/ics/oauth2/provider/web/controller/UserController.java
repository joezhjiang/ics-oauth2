package org.ics.oauth2.provider.web.controller;

import org.apache.log4j.Logger;
import org.ics.oauth2.provider.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/user")
public class UserController {
	private final Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(params = "method=addUser", headers = "Accept=application/json")
	public User addUser(User user) {
		logger.info("before invoke addUser...");
		logger.info(user);
		// to do
		logger.info("after invoke addUser...");
		return user;
	}

	@RequestMapping(value = "/{userId}", params = "method=detailUser")
	public String detailUser(@PathVariable Long userId) {
		logger.info("before invoke detailUser...");
		logger.info(userId);
		// to do
		logger.info("after invoke detailUser...");
		return "detailUser";
	}

	@RequestMapping(value = "/{userId}", params = "method=deleteUser")
	public String deleteUser(@PathVariable Long userId) {
		logger.info("before invoke deleteUser...");
		logger.info(userId);
		// to do
		logger.info("after invoke deleteUser...");
		return "deleteUser";
	}

	@RequestMapping(params = "method=batchDeleteUser")
	public String batchDeleteUser(@RequestParam Long[] userIds) {
		logger.info("before invoke batchDeleteUser...");
		for (Long userid : userIds) {
			logger.info(userid);
		}
		// to do
		logger.info("after invoke batchDeleteUser...");
		return "batchDeleteUser";
	}
}
