package org.beanio.stream;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.FixedLengthParserBuilder;
import org.beanio.builder.StreamBuilder;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

public class Gerador {

    public static void main(String[] args) throws IOException {
        StreamFactory factory = StreamFactory.newInstance();
        StreamBuilder builderCSV = new StreamBuilder("Tm")
                .format("fixedlength")
                .parser(new FixedLengthParserBuilder())
                .addGroup(GrupoDeEmpregados.class);
        factory.define(builderCSV);

        StringWriter out = new StringWriter();
        BeanWriter writer = factory.createWriter("Tm", out);

        GrupoDeEmpregados grupoDeEmpregados = new GrupoDeEmpregados();
        grupoDeEmpregados.setDepartamento(new Departamento("Desenvolvimento"));
        grupoDeEmpregados.getEmpregados().add(new Empregado("Beltrano", "da Silva", "Especialista", "1000", new Date()));
        grupoDeEmpregados.getEmpregados().add(new Empregado("Fulano", "de Tal", "Programador", "300", new Date()));

        writer.write(grupoDeEmpregados);
//        for (Empregado e : departamento.getEmpregados()) {
//            writer.write(e);
//        }

        writer.flush();
        writer.close();

        System.out.println(out.toString());

    }
}
