package pi.com.entity;

public enum EstadoAtividade {

	//CAD("CADASTRADA"), VAL("VAlIDADA"),  CAN("CANCELADA"), WAIT("ESPERA"), REF("RECUSADA");
	
	CAD("CADASTRADA"), VAL("VALIDADA"), CAN("CANCELADA"), REC("RECUSADA"), ESP("ESPERA"), NULL("NULL");
    private final String state;

  

	private EstadoAtividade(String state) {
		this.state = state;
	}
	public String getEstadoNome() {
		return state;
	}
	
}
