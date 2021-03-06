package com.blue.api.rest.internal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author Sriram Puvvada
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidContentException extends RuntimeException {

    private static final long serialVersionUID = 2620685905341304380L;
}
