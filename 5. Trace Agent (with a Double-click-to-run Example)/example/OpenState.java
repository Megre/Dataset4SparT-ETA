package example;

public class OpenState implements DoorState {

	@Override
	public void touch(Door context) {
		context.setState(new ClosedState());
		System.out.println("Door Closed");
	}

}
