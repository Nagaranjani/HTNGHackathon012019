package org.htng.chargers.athidhi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.json.bind.annotation.JsonbProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DateClass {
	private Date date;

	public String getFromDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		return sdf.format(cal.getTime());
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
