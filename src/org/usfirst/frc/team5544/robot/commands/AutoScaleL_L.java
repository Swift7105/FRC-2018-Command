package org.usfirst.frc.team5544.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoScaleL_L extends CommandGroup {

    public AutoScaleL_L() {
    	
    	addSequential(new DriveForward3seconds());
    	addSequential(new Left90());
    	addSequential(new ElevatorScaleUp());
    	addSequential(new DriveReverse0_5second());
    	addSequential(new DumperOut());
    	
    	
    	
    	
    
    	/*DriveForward.start();
		Timer.delay(3);
		DriveForward.cancel();
		Robot.DRIVETRAIN.Left90();
		Robot.DRIVETRAIN.DriveForward();
		Timer.delay(2);
		Robot.DRIVETRAIN.Right90();
		Robot.DRIVETRAIN.DriveForward();
		Timer.delay(4);
		Robot.DRIVETRAIN.Left90();
		Robot.ELEVATOR.Up();
		Timer.delay(2);
		Robot.DUMPER.DumperOut();
		Robot.DUMPER.DumperIn();
		Robot.ELEVATOR.Down();
		Timer.delay(1.5);*/
    	
    	
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
