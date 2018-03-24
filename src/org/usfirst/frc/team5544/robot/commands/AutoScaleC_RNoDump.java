package org.usfirst.frc.team5544.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoScaleC_RNoDump extends CommandGroup {

    public AutoScaleC_RNoDump() {
    	
    	addSequential(new DriveForward2seconds());
    	addSequential(new Right90());
    	Timer.delay(2);
    	addSequential(new DriveForward1_5seconds());
    	addSequential(new Left90());
    	addSequential(new DriveForward3seconds());
    	addSequential(new Right90());
    	/*addSequential(new ElevatorScaleUp());
    	addSequential(new DumperOut());
    	addSequential(new DumperIn());
    	addSequential(new ElevatorScaleDown());*/
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
