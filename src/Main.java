import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Sistema Operacinal");
        curso2.setDescricao("Um curso voltado a ensinar os fundamento de SO");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMoraniel = new Dev();
        devMoraniel.setNome("Moraniel");
        devMoraniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos por "+ devMoraniel.getNome()+":" + devMoraniel.getConteudosInscritos());
        devMoraniel.progredir();
        devMoraniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos por "+ devMoraniel.getNome()+":" + devMoraniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos por "+ devMoraniel.getNome()+":" + devMoraniel.getConteudosConcluidos());
        System.out.println("XP:" + devMoraniel.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos"+devJoao.getNome()+":" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devJoao.getNome()+":" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos "+devJoao.getNome()+":" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
