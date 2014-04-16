package org.ics.oauth2.provider.utils;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {
	private final Logger logger = Logger.getLogger(this.getClass());
	@Override
	public Date convert(String dateStr) {
		try {
			return DateUtils.parseDate(dateStr, new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss1"});
		} catch (ParseException e) {
			logger.error(e);
			return null;
		}
	}

}
