package TeoriaStream;

public interface FairGround {
	public String saluda();

	public default FairGround dismantle() {
		return this;
	}
}
