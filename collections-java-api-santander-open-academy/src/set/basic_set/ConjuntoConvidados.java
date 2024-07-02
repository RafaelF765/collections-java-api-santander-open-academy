package set.basic_set;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado: convidados){
            if (convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

}
