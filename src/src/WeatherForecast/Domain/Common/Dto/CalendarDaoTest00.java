package WeatherForecast.Domain.Common.Dto;


import WeatherForecast.Domain.Common.Dao.CalendarDao;

public class CalendarDaoTest00 {
		
	@Test
	public void CalendarTest1() {
		CalendarDao dao = new CalendarDao();
		//객체연결 여부 확인 Test 함수
		assertNotNull(dao);
		
	}
	
	@Test
	public void BookDatest2_insert() throws Exception{
		CalendarDao dao = new CalendarDao();
	}
}
