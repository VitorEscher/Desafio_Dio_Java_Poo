import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Vitor" + devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("conteudos inscritos Vitor" + devVitor.getConteudosInscritos());
        System.out.println("conteudos concluidos Vitor" + devVitor.getConteudosConcluidos());

        System.out.println("************************************************************************************************");

        Dev devEvelyn = new Dev();
        devEvelyn.setNome("Evelyn");
        devEvelyn.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Evelyn" + devEvelyn.getConteudosInscritos());
        devEvelyn.progredir();
        System.out.println("conteudos inscritos Evelyn" + devEvelyn.getConteudosInscritos());
        System.out.println("conteudos concluidos Evelyn" + devEvelyn.getConteudosConcluidos());
    }
}
