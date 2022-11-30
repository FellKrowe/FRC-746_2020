package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


public Joystick driver;
public JoystickButton forward;
public JoystickButton reverse;
public JoystickButton left;
public JoystickButton right;

public Joystick operator;
public JoystickButton climb;
public JoystickButton climbReset;
public JoystickButton raiseArm;
public JoystickButton lowerArm;
public JoystickButton intake;
public JoystickButton outTake;



    public OI() {

driver = new Joystick(1);

forward = new JoystickButton(driver, 4);
forward.whileHeld(new creepDrive(.38,.3));

reverse = new JoystickButton(driver, 2);
reverse.whileHeld(new creepDrive(-.27,-.33));

left = new JoystickButton(driver, 1);
left.whileHeld(new creepDrive(-.3,.3));

right = new JoystickButton(driver, 3);
right.whileHeld(new creepDrive(.3,-.3));


operator = new Joystick(0);

climb = new JoystickButton(operator, 7);
climb.whileHeld(new ClimbControl(.5));

climbReset = new JoystickButton(operator, 5);
climbReset.whileHeld(new ClimbControl(-.5));

raiseArm = new JoystickButton(operator, 4);
raiseArm.whenPressed(new ArmControl(true));

lowerArm = new JoystickButton(operator, 2);
lowerArm.whenPressed(new ArmControl(false));

intake = new JoystickButton(operator, 6);
intake.whileHeld(new intakeControl(.85));

outTake = new JoystickButton(operator, 8);
outTake.whileHeld(new intakeControl(-.90));

    }
    
public Joystick getJoystick1() {
        return driver;
    }

public Joystick getJoystick2() {
        return operator;
    }

}

