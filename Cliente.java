public class Cliente {

    private AlunoEstado estado;
    private List<ClienteEstado> memento = new ArrayList<ClienteEstado>();

    public ClienteEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice ilegal");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ClienteEstado> getEstados() {
        return this.memento;
    }
}
