package simpleListeners;

import java.util.HashSet;
import java.util.Set;
/**
 * Basic implementation of {@link EventSource}
 * */
public abstract class BasicEventSource implements EventSource{
	private final Set<Listener> listeners = new HashSet<>();
	@Override
	public void addListener(Listener listener) {
		this.listeners.add(listener);
	}
	@Override
	public void removeListener(Listener listener) {
		this.listeners.remove(listener);
	}
	abstract protected void fireEvent();
}
