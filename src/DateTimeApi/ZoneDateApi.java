package DateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by boki on 5/15/16.
 */
public class ZoneDateApi {
    public static void main(String args[]){
        ZoneDateApi zoneDateApi = new ZoneDateApi();
        zoneDateApi.testZonedDateTime();
    }

    public void testZonedDateTime(){
        // Get the current date and time
        ZonedDateTime date1 = ZonedDateTime.parse("2016-05-15T10:15:30+05:30[Asia/Taipei]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
}
