package org.usfirst.frc.team5544.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoSwitchL_R extends CommandGroup {

    public AutoSwitchL_R() {
    	
    	
    	
    	addSequential(new DriveForward0_5second());
    	addSequential(new Right90());
    	addSequential(new DriveForward1_5seconds());
    	addSequential(new Left90());
    	addSequential(new DriveForward1_5seconds());
    	addSequential(new Right90());
    	addSequential(new DriveReverse0_5second());
    	addSequential(new Intake_Switch());
    	addSequential(new ElevatorSwitchUp());
    	addSequential(new DumperOut());
    	addSequential(new Intake_Back());
    	
    	
    	
    	/*Robot.DRIVETRAIN.DriveForward();
		Timer.delay(2);
		Robot.DRIVETRAIN.Left90();
		Robot.DRIVETRAIN.DriveReverse();
		Timer.delay(2);
		Robot.ELEVATOR.Up();
		Timer.delay(4);
		Robot.DUMPER.DumperOut();
		Robot.DUMPER.DumperIn();
		Robot.ELEVATOR.Down();
		Timer.delay(4);*/

    	
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
