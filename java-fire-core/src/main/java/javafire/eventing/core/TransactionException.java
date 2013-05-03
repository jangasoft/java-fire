package javafire.eventing.core;

/**
 * Class of exception thrown by an {@link EventTransaction}.
 * 
 * @author Emerson Loureiro
 */
@SuppressWarnings("serial")
public class TransactionException extends RuntimeException {

	private final String transactionId;

	public TransactionException(Exception cause, String transactionId) {
		super(cause);
		this.transactionId = transactionId;
	}

	public TransactionException(String message, String transactionId) {
		super(message);
		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
}
