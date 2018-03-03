package headfirst.command.simpleremote;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garageDoor = new GarageDoor(); //接收者对象(包含具体的执行方法)
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor); //命令对象（将接收者对象传递给命令对象）
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}

}
