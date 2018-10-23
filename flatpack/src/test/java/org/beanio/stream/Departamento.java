package org.beanio.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Data
@Record
@AllArgsConstructor
@RequiredArgsConstructor
public class Departamento {

    @Field(ordinal = 1, length = 20)
    private String descricao;
}
