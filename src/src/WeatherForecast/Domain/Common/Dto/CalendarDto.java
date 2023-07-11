package WeatherForecast.Domain.Common.Dto;

import java.sql.Date;

public class CalendarDto {

	private int id;
	private String memo;
	private Date date;
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//toString
	@Override
	public String toString() {
		return "CalendarDto [id=" + id + ", memo=" + memo + ", date=" + date + "]";
	}
	
	
	//생성자
	public CalendarDto(){} //디폴트 생성자
	public CalendarDto(int id,String memo,Date date) {
		this.id = id;
		this.memo = memo;
		this.date =date;
		
	}
	
	
	
}
