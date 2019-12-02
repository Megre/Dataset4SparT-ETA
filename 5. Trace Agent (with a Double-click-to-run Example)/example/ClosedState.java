package example;

public class ClosedState implements DoorState {

	@Override
	public void touch(Door context) {
		context.setState(new OpenState());
		System.out.println("Door Open");
	}

}
