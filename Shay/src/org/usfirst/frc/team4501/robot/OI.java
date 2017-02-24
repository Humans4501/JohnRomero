package org.usfirst.frc.team4501.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team4501.robot.XboxController.Trigger;
import org.usfirst.frc.team4501.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	XboxController controller = new XboxController(0);
	Joystick stick = new Joystick(1);
	
	public double getLeftXboxX() {
		return controller.getRawAxis(0);
	}

	public double getLeftXboxY() {
		return controller.getRawAxis(1);
	}

	public double getRightXboxX() {
		return controller.getRawAxis(4);
	}

	public double getRightXboxY() {
		return controller.getRawAxis(5);
	}

	public double getShooterX() {
		return stick.getX();
	}

	public double getShooterY() {
		/*
		 * if (shooter.getY() >= .5) { return 0.5; } else if (shooter.getY() <=
		 * -.3) { return -0.3; } else { return shooter.getY(); }
		 */
		return stick.getY();
	}

	public double getShooterThrottle() {
		return stick.getZ();
	}

	public double getRightTrigger() {
		return controller.getRawTrigger(Trigger.RIGHT);
	}

	public double getLeftTrigger() {
		return controller.getRawTrigger(Trigger.LEFT);
	}

	public double getTrottle() {
		return controller.getZ();
	}

	public double getTriggers() {
		return controller.getRawAxis(XboxController.TRIGGER_L) - controller.getRawAxis(XboxController.TRIGGER_R);
	}
}
