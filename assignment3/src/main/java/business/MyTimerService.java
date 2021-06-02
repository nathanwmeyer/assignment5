package business;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;

@Stateless
public class MyTimerService {

    /**
     * Default constructor. 
     */
    public MyTimerService() {
        // TODO Auto-generated constructor stub
    }
	
	@SuppressWarnings("unused")
	@Schedule(second="*/10", minute="*", hour="8-23", dayOfWeek="Mon-Fri",
      dayOfMonth="*", month="*", year="*", info="MyTimer")
    private void scheduledTimeout(final Timer t) {
        System.out.println("@Schedule called at: " + new java.util.Date());
    }
}