// RobotBuilder Version: 2.0
package frc.robot.subsystems;


//import frc.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.SpeedController;



/**
 *
 */
public class Arm extends Subsystem {


private Talon armMotor;
private Talon intakeMotor;
private Compressor compressor1;
private DoubleSolenoid armCyl;


    public Arm() {
    
armMotor = new Talon(5);
addChild("ArmMotor",armMotor);
armMotor.setInverted(false);

intakeMotor = new Talon(6);
intakeMotor.setInverted(false);

armCyl = new DoubleSolenoid(0, 0, 1);
compressor1 = new Compressor(0);

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

    public void setIntake(double speed) {
        if (speed > 1 || speed <-1) {
            System.out.println("Warning: Motor at dangerous speeds.");
        }
        else {
        intakeMotor.set(speed);
        }
    }

    public void stopIntake(){
        intakeMotor.set(0);
    }

    public void setArm(double speed) {
        if (speed > 1 || speed <-1 ) {
            System.out.println("Warning: Arm motor moving at dangerous speeds.");
        }
        else {
            armMotor.set(speed);
        }
    }

    public void stopArm(){
        armMotor.set(0);
    }

    public void setCompressor(boolean isOn) {
		if (isOn == true) {
			compressor1.start();
		} else {
			compressor1.stop();
		}
	}

	public void setCylinder(boolean isForward) {
		if (isForward == true) {
			armCyl.set(DoubleSolenoid.Value.kForward);
		} else {
			armCyl.set(DoubleSolenoid.Value.kReverse);

		}
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

