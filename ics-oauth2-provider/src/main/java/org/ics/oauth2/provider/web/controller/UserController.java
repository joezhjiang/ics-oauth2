package org.ics.oauth2.provider.web.controller;

import java.util.Calendar;

import org.apache.log4j.Logger;
import org.ics.oauth2.provider.bean.Gender;
import org.ics.oauth2.provider.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RequestMapping("/user")
public class UserController {
	private final Logger logger = Logger.getLogger(this.getClass());

	//, produces = "application/json; charset=utf-8"
	@RequestMapping(params = "method=addUser")
	@ResponseBody
	public User addUser(User user) {
		logger.info("before invoke addUser...");
		user.setName("姓名："+user.getName());
		logger.info(user);
		// to do
		logger.info("after invoke addUser...");
		return user;
	}

	//, produces = "application/json; charset=utf-8"
	@RequestMapping(value = "/{userId}", params = "method=detailUser")
	@ResponseBody
	public User detailUser(@PathVariable Long userId) {
		logger.info("before invoke detailUser...");
		logger.info(userId);
		User user = new User();
		user.setId(userId);
		user.setName("姓名");
		user.setGender(Gender.MALE);
		user.setBorthday(Calendar.getInstance().getTime());
		// to do
		logger.info("after invoke detailUser...");
		return user;
	}

	@RequestMapping(value = "/{userId}", params = "method=deleteUser")
	@ResponseBody
	public Long deleteUser(@PathVariable Long userId) {
		logger.info("before invoke deleteUser...");
		logger.info(userId);
		// to do
		logger.info("after invoke deleteUser...");
		return userId;
	}

	@RequestMapping(params = "method=batchDeleteUser")
	@ResponseBody
	public Long[] batchDeleteUser(@RequestParam Long[] userIds) {
		logger.info("before invoke batchDeleteUser...");
		for (Long userid : userIds) {
			logger.info(userid);
		}
		// to do
		logger.info("after invoke batchDeleteUser...");
		return userIds;
	}
}
