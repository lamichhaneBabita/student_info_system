package com.consultadd.studentInfoSystem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ResourceNotFound extends Exception {
    private String name;
    private long id;
    private String field;

    public ResourceNotFound(String name, long id, String field) {
        super();
        this.name = name;
        this.id = id;
        this.field = field;
    }


}
