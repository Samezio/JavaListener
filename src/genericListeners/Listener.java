package genericListeners;
/**
 * Generic Listener.
 * */
public interface Listener<D> {
	/**
	 * Fired when event occurs.
	 * */
	public void eventOccured(EventSource<D> source, D data);
	/**
	 * Fired when error is thrown.
	 * */
	public void exceptionOccured(EventSource<D> source, Throwable throwable);
}
