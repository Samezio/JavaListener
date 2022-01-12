# JavaListener
Utility event source and event listener in Java.

### Generic Listener
- Implement EventSource<DataType> to class that need to be listened and 'DataType' is generic type of which the data will be shared on event.
- Use Listener<DataType> to listen to the class object.
- Look into BasicEventSource for basic implementation of EventSource, you'll just need to implement fireEvent method and use it to create event.
### Simple Listener
Simpler listener and event source without generic.
