package org.usfirst.frc.team5544.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoSwitchC_R extends CommandGroup {

    public AutoSwitchC_R() {
    	
    	addSequential(new DriveReverse0_5second());
    	SmartDashboard.putString("Step", "1");
    	addSequential(new Right_R45());
    	SmartDashboard.putString("Step", "2");
    	addSequential(new DriveReverseFirst());
    	SmartDashboard.putString("Step", "3");
    	addSequential(new Left_R45());
    	SmartDashboard.putString("Step", "4");
    	addSequential(new DriveReverseSlow());
    	SmartDashboard.putString("Step", "5");
    	addSequential(new Intake_Switch());
    	SmartDashboard.putString("Step", "6");
    	addSequential(new ElevatorSwitchUp());
    	SmartDashboard.putString("Step", "7");
    	addSequential(new DumperOut());
    	SmartDashboard.putString("Step", "End");
    	addSequential(new Intake_Back());
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
