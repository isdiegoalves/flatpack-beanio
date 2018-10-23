package org.beanio.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.beanio.annotation.Group;
import org.beanio.annotation.Record;

import java.util.ArrayList;
import java.util.List;

@Group(minOccurs = 1, maxOccurs = Integer.MAX_VALUE)
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GrupoDeEmpregados {

    @Record(order = 1, minOccurs = 1)
    private Departamento departamento;

    @Record(order=2)
    private List<Empregado> empregados = new ArrayList<>();
}