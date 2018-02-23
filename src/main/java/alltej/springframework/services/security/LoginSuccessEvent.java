package alltej.springframework.services.security;

import org.springframework.context.ApplicationEvent;

/**
 * Created by at on 1/6/15.
 */
public class LoginSuccessEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public LoginSuccessEvent(Object source) {
        super(source);
    }
}
