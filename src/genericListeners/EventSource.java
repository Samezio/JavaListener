package genericListeners;
/**
 * A blueprint for a class that will generate event to be listened by others
 * */
public interface EventSource<D> {
	/**
	 * Adds listener.
	 * @param listener {@link Listener} to be added.
	 * */
	public void addListener(Listener<D> listener);
	/**
	 * Removes listener.
	 * @param listener {@link Listener} to be removed
	 * */
	public void removeListener(Listener<D> listener);
}
