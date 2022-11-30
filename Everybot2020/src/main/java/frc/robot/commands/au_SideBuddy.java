/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class au_SideBuddy extends CommandGroup {
  /**
   * Add your docs here.
   */
  public au_SideBuddy() {
    addSequential(new ArmControl(false));
    addSequential(new au_doNothing(2));
    addSequential(new au_intakeControl(3, -.90));
    addSequential(new au_doNothing(1));
    addSequential(new au_moveRobot(-.35, -.5, false, 1.75));
    addSequential(new au_moveRobot(-.38, -.45, false, 1));
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
