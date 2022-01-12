package genericListeners;

import java.util.HashSet;
import java.util.Set;
/**
 * Basic implementation of {@link EventSource}
 * */
public abstract class BasicEventSource<D> implements EventSource<D>{
	private final Set<Listener<D>> listeners = new HashSet<>();
	@Override
	public void addListener(Listener<D> listener) {
		this.listeners.add(listener);
	}
	@Override
	public void removeListener(Listener<D> listener) {
		this.listeners.remove(listener);
	}
	abstract protected void fireEvent();
}
