package ashdihomwork252arraylist;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Employee Not Found")
public class NotFoundAnyMatchException extends Exception{

    public NotFoundAnyMatchException(String s) {
    }
}