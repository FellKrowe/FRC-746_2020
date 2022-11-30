
package frc.robot.subsystems;



import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class Climber extends Subsystem {

private Talon climbMotor;

    public Climber() {
        
climbMotor = new Talon(3);
addChild("ClimbMotor",climbMotor);
climbMotor.setInverted(false);
        
    }

    @Override
    public void initDefaultCommand() {
   
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void setClimber(double speed) {
        if (speed > 1 || speed < -1 ) {
            System.out.println("Warning: Climber Motor at dangerous speed.");
        }
        else {
            climbMotor.set(speed);
        }
    }

    public void stopClimber() {
        climbMotor.set(0);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

