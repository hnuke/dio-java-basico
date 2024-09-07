package bootcamp;

import java.util.List;

public class Dev implements IFuncoesClasses{

    String nome;
    List<Mentoria> mentorias;
    List<Atividade> atividades;
    


    @Override
    public void CalcularXP() {}

    public void inscreverNoBootcamp(Bootcamp bc){
        bc.listaDevs.add(this);
        mentorias.addAll(bc.listaMentorias);
        atividades.addAll(bc.listaAtividades);
    }

    public List<Atividade> exibirCursos(){
        return atividades;
    }


}
