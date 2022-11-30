package frc.robot.subsystems;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Joystick;



/**
 *
 */
public class ColorWheel extends Subsystem {

String colorString;
private Talon colorMotor;

    public ColorWheel() {
        
    colorMotor = new Talon(4);
    addChild("ColorMotor",colorMotor);
    colorMotor.setInverted(false);
    //colorMotor.setBounds(max, deadbandMax, center, deadbandMin, min);
        
    }

    @Override
    public void initDefaultCommand() {
       setDefaultCommand(new ColorSpin());
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }  

    public void setColor(Double speed) {
        if (speed > 1 || speed < -1 ) {
            System.out.println("Warning: Motor moving at dangerous speed.");
        }
        else {
            colorMotor.set(speed);
        }
    }

    public void getInput(Joystick input){
        setColor(input.getX());
    }

    public void stopWheel() {
        colorMotor.set(0);
    }
    
  }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.



