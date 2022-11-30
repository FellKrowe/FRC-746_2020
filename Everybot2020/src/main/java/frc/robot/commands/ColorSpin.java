package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 *
 */
public class ColorSpin extends Command {

    

    public ColorSpin() {
        requires(Robot.colorWheel);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        Robot.colorWheel.stopWheel();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.colorWheel.getInput(Robot.oi.getJoystick1());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.colorWheel.stopWheel();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}
