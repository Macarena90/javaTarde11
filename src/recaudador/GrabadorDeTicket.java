package recaudador;

public class GrabadorDeTicket {
    private RepositorioDeTexto repositorioDeTexto;

    public GrabadorDeTicket(RepositorioDeTexto repositorioDeTexto) {
        this.repositorioDeTexto = repositorioDeTexto;
    }    
    public void grabar(Ticket ticket) {
        repositorioDeTexto.grabar(ticket);
    }
}
