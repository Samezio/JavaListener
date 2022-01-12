package simpleListeners;

/**
 * A blueprint for a class that will generate event to be listened by others
 * */
public interface EventSource {
	/**
	 * Adds listener.
	 * @param listener {@link Listener} to be added.
	 * */
	public void addListener(Listener listener);
	/**
	 * Removes listener.
	 * @param listener {@link Listener} to be removed
	 * */
	public void removeListener(Listener listener);
}
