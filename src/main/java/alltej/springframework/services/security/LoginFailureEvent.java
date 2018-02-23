package alltej.springframework.services.security;

import org.springframework.context.ApplicationEvent;

/**
 * Created by at on 1/6/15.
 */
public class LoginFailureEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public LoginFailureEvent(Object source) {
        super(source);
    }
}
