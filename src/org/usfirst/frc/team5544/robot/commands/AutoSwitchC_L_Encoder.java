package org.usfirst.frc.team5544.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoSwitchC_L_Encoder extends CommandGroup {

	public AutoSwitchC_L_Encoder() {
		SmartDashboard.putString("Dubug 2", "Starting Logic");
		addSequential(new AutoSwitch_C_L_Reverse1());
		SmartDashboard.putString("Dubug 2", "Logic 1");
		addSequential(new AutoSwitch_C_L_TurnLeft2());
		SmartDashboard.putString("Dubug 2", "Logic 2");
		addSequential(new AutoSwitch_C_L_Reverse3());
		SmartDashboard.putString("Dubug 2", "Logic 3");
		addSequential(new AutoSwitch_C_L_TurnRight4());
		SmartDashboard.putString("Dubug 2", "Logic 4");
		addSequential(new AutoSwitch_C_L_Reverse5());
		SmartDashboard.putString("Dubug 2", "Logic 5");
		addSequential(new Intake_Rotate_Out());
		SmartDashboard.putString("Dubug 2", "Logic 6");
		addSequential(new ElevatorSwitchUp());
		SmartDashboard.putString("Dubug 2", "Logic 7");
		addSequential(new DumperOut());
		SmartDashboard.putString("Dubug 2", "Logic 8");
		addSequential(new DumperIn());
		addSequential(new ElevatorSwitchDown());
		addSequential(new DriveForward0_5second());
		addSequential(new Left90());

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
