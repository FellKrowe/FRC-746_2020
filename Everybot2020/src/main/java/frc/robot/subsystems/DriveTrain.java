package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    private final Talon leftMotor;
    private final Talon rightMotor;
    //private final Talon speedController3;
    //private final Talon speedController4;
    
    /*
    private final PWMVictorSPX speedController1;
    private final PWMVictorSPX speedController2;
    private final PWMVictorSPX speedController3;
    private final PWMVictorSPX speedController4;
    */
    //private final SpeedControllerGroup leftMotor;
    //private final SpeedControllerGroup rightMotor;
    private final DifferentialDrive robotDrive;
    
    
 


    public DriveTrain() {

        leftMotor = new Talon(0);   
        leftMotor.setInverted(false);

        rightMotor = new Talon(1);
        rightMotor.setInverted(false);

        robotDrive = new DifferentialDrive(leftMotor, rightMotor);

        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setMaxOutput(0.8);
        
        
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new RobotDrive());
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }

    public void stop() {
        robotDrive.curvatureDrive(0, 0, false);
    }

    public void getArcadeDrive(double throttle,double twist, boolean isOn) {
       robotDrive.arcadeDrive(throttle, twist, true);
    }

    public void getJoystick(Joystick driver) {
        getArcadeDrive(-driver.getThrottle(), driver.getTwist() , true);
    }

    public void tankDrive(double left, double right, boolean squared){
        robotDrive.tankDrive(left, right,squared);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}


