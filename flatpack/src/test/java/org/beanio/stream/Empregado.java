package org.beanio.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

import java.util.Date;

@Record
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Empregado {

    @Field(ordinal = 1, length = 30)
    private String firstName;
    @Field(ordinal = 2, length = 30)
    private String lastName;
    @Field(ordinal = 3, length = 30)
    private String title;
    @Field(ordinal = 4, length = 8)
    private String salary;
    @Field(ordinal = 5, format = "yyyy-MM-dd", length = 10)
    private Date hireDate;

}