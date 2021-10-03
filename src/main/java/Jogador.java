public class Jogador {
    private String tagName;
    private boolean logado;

    public Jogador(String tagName, boolean logado) {
        this.tagName = tagName;
        this.logado = logado;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
