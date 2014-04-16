package org.ics.oauth2.provider.utils;

import org.apache.log4j.Logger;
import org.ics.oauth2.provider.bean.Gender;
import org.springframework.core.convert.converter.Converter;

public class GenderConverter implements Converter<String, Gender> {
	private final Logger logger = Logger.getLogger(this.getClass());

	@Override
	public Gender convert(String gender) {
		if (Gender.MALE.name().equals(gender)) {
			return Gender.MALE;
		} else if (Gender.FEMALE.name().equals(gender)) {
			return Gender.FEMALE;
		} else {
			logger.info(gender);
			return Gender.OTHER;
		}
	}

}
