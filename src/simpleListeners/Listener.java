package simpleListeners;
/**
 * Generic Listener.
 * */
public interface Listener {
	/**
	 * Fired when event occurs.
	 * */
	public void eventOccured(EventSource source, Object data);
	/**
	 * Fired when error is thrown.
	 * */
	public void exceptionOccured(EventSource source, Throwable throwable);
}
