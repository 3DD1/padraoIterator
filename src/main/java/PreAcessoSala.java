import java.util.Iterator;

public class PreAcessoSala {
    public static Integer mostrarQuantidadeDeJogadores(SalaDeJogo saladejogo){
        int quantidade = 0;
        for(Jogador jogador : saladejogo){
            if(jogador.isLogado()){
                quantidade++;
            }
        }
        return quantidade;
    }
    public static Integer contarQuantidadeDeJogadores(SalaDeJogo saladejogo){
        int quantidade = 0;
        for (Iterator a =  saladejogo.iterator(); a.hasNext();){
            quantidade ++;
            a.next();
        }
        return quantidade;
    }
}
