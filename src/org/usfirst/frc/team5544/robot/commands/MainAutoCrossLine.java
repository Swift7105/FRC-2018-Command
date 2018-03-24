package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class MainAutoCrossLine extends CommandGroup {
	
	Command AutoLineCross;
	
    public MainAutoCrossLine() {
    	requires(Robot.DRIVETRAIN);
    	requires(Robot.class);
    	AutoLineCross = new AutoCrossLine();
    	
    	
    
    	
    	
    	

    	
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

	private void requires(Class<Robot> class1) {
		// TODO Auto-generated method stub
		
	}
	
	protected void execute() {
		AutoLineCross.start();
		SmartDashboard.putString("Running:","Auto Cross Line" );
		

	}
}
