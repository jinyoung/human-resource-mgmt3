package human.resource.mgmt.event;

import lombok.Data;
import lombok.ToString;





@Data
@ToString
public class CalendarRegisteredEvent {

    private Long id;
    private String userId;
    private List&lt;Schedule&gt; schedules;

}
