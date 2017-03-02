package com.boot.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by darlan on 02/02/17.
 */
@Component
public class PersonsImpl implements Persons {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Response list() {
        try {
            final List<Person> data = personRepository.findAll();
            return Response.ok(data).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @Override
    public Response post(final Person person) {
        try {
            return Response.ok(personRepository.save(person)).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

}
