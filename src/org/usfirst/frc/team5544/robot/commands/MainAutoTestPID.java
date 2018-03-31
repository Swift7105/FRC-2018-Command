package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MainAutoTestPID extends CommandGroup {

	Command Left90;
	Command Right90;
	Command AutoSwitchC_L_Encoder = new AutoSwitchC_L_Encoder();

	public MainAutoTestPID() {
		requires(Robot.DRIVETRAIN);
		requires(Robot.class);
		Left90 = new Left90();
		Right90 = new Right90();

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

	private void requires(Class<Robot> class1) {
		// TODO Auto-generated method stub

	}

	protected void execute() {
		AutoSwitchC_L_Encoder.start();
		SmartDashboard.putString("Debug", "Called MainTestPID");

	}
}
