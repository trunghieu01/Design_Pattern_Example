package context;

import state.State;

public class DocumentContext {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void applyState() {
		this.state.handleRequest();
	}
}
