package org.usfirst.frc.team5544.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoSwitchC_R extends CommandGroup {

    public AutoSwitchC_R() {
    	
    	addSequential(new DriveReverse0_5second());
    	addSequential(new Right45());
    	addSequential(new DriveReverse0_5second());
    	addSequential(new Left45());
    	addSequential(new DriveReverseSlow());
    	addSequential(new Intake_Rotate_Out());
    	addSequential(new ElevatorSwitchUp());
    	addSequential(new DumperOut());
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
