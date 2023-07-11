package WeatherForecast.Domain.Common.Service;

import java.util.List;

import javax.xml.crypto.Data;

import WeatherForecast.Domain.Common.Dao.CalendarDao;
import WeatherForecast.Domain.Common.Dto.CalendarDto;

	
public class CalendarSerivce {
	
	private CalendarDao dao = new CalendarDao();
	
	
	// 메모 저장하기(등록하기)  서비스
	public boolean addMemo(CalendarDto dto) throws Exception{
		System.out.println("CalendarSerivce`s addMemo");
		return true;
	}
	
		
		// 저장 메모 불러오기서비스
		//public boolean addMemo(CalendarDto dto) 
		//throws Exception: addMemo 메소드는 CalendarDto 객체를 매개변수로 받으며,
		List<CalendarDto> loadMemo(CalendarDto dto)throws Exception{
		    List<CalendarDto> memoList = dao.Select();
		    return dao.Select();
	        
		}
	
	//수정
	public boolean modifyMemo(CalendarDto dto) throws Exception{
		System.out.println("CalendarService`s updateCalendar()");
		return false;
		
	}
	
	//삭제
	boolean removeMemo(int id ,String memo ,Data date) {
		System.out.println("Calendar`s Remove");
		return false;
	}
	
}
