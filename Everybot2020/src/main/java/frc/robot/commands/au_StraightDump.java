/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class au_StraightDump extends CommandGroup {
  /**
   * Add your docs here.
   */
  public au_StraightDump() {
    addSequential(new ArmControl(false));
    addSequential(new au_doNothing(.75));
    addSequential(new ArmControl(true));
    addSequential(new au_moveRobot(.5,.4, false, 2.5));
    addSequential(new au_doNothing(1));
    addSequential(new au_intakeControl(3, -.90));
    addSequential(new au_moveRobot(-.4, -.46, false, .7));
    addSequential(new au_moveRobot(.45, -.45, false, .75));
    addSequential(new au_moveRobot(-.4, -.46, false, 1.55));
    
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
