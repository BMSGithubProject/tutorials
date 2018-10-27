package com.bms.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class ZoneDateTimeExample {

    public ZonedDateTime getCurrentTimeByZoneId(String region) {
        ZoneId zone = ZoneId.of(region);
        ZonedDateTime date = ZonedDateTime.now(zone);
        return date;
    }

    public ZonedDateTime convertZonedDateTime(ZonedDateTime sourceDate, String destZone) {

        ZoneId destZoneId = ZoneId.of(destZone);
        ZonedDateTime destDate = sourceDate.withZoneSameInstant(destZoneId);

        return destDate;
    }
}
