package example;

public class Door {
	private DoorState state;
	
	public Door() {
		setState(new ClosedState());
	}
	
	public Door(DoorState state) { 
		setState(state);
	}

	public void touch() {
		state.touch(this);
	}
	
	protected void setState(DoorState state) {
		this.state = state;
	}
	
	public static void main(String[] args) {
		DoorState open = new OpenState();
		Door door = new Door(open);
		door.touch();
	}
}
