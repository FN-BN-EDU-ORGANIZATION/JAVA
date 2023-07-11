package WeatherForecast.Domain.Common.Dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import WeatherForecast.Domain.Common.Dao.CalendarDao;

class DaoTests {

	
	/*
	 * CalendarTest01(): CalendarDao 객체를 생성하고,
		객체가 정상적으로 생성되었는지를 확인합니다.
	 *  이를 통해 CalendarDao 클래스의 인스턴스 생성과 연결 설정 등이 올바르게 동작하는지 확인할 수 있습니다.
	 */
	@Test
	public void CalendarTest01() {
		CalendarDao dao = new CalendarDao();
		//객체연결 여부 확인 Test 함수
		assertNotNull(dao);
		
	}
	/*
	 * alendarTest02_insert(): CalendarDao 객체를 생성하고, 
	 * Insert() 메서드를 호출하여 데이터를 삽입합니다.
	 *  이후 삽입된 데이터의 개수를 확인하여 삽입이 정상적으로 이루어졌는지를 검증합니다. 
	 * 이를 통해 Insert() 메서드가 예상대로 동작하는지를 확인할 수 있습니다.
	 */
	@Test
	public void CalendarTest02_insert () throws Exception {
		CalendarDao dao = new CalendarDao();
		//객체연결 여부 확인 Test 함수a
		assertNotNull(dao);
		//dao.Insert(dto) 호출 result변수에 넣어줌
		int result = dao.Insert(new CalendarDto(1,"홍길동",Date.valueOf("2023-03-12")));
		assertEquals(1,result); //기대값 실제값
	}
	@Test
	public void CalendarTest03_insert_post100 () throws Exception {
		CalendarDao dao = new CalendarDao();
		//객체연결 여부 확인 Test 함수a
		assertNotNull(dao);
		//dao.Insert(dto) 호출 result변수에 넣어줌
		int result = 0;
		for(int i=1; i<100; i++) {
			result+= dao.Insert(new CalendarDto(1+i,"남성",Date.valueOf("2023-12-30")));
		}
		assertEquals(99,result); //기대값 실제값
	}
	
	@Test
	public void CalendarTest04_select() throws Exception{
		CalendarDao dao = new CalendarDao();
		assertNotNull(dao);
		
		List<CalendarDto> list = dao.Select();
		assertNotNull(list);
		
		list.stream().forEach((dto)->{
			System.out.println(dto);
		});
		
		
	}
	
	@Test
	public void Calendar5_select_bookcode() throws Exception{
		CalendarDao dao = new CalendarDao();
		assertNotNull(dao);
		
		CalendarDto dto = dao.Select(10);
		assertNotNull(dto);
		
		System.out.println(dto);
	}

}
