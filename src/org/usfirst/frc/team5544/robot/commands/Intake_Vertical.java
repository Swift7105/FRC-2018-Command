package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;
import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake_Vertical extends Command {
	boolean finished;
	double setpoint = 100;
	double error = Math.abs(setpoint - RobotMap.Intake.getDistance());
	

    public Intake_Vertical() {
    	requires(Robot.INTAKEROTATEPID);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (error > 100) {
    		finished = false;
        	Robot.INTAKEROTATEPID.setSetpoint(setpoint);
        	Robot.INTAKEROTATEPID.enable();
    	}
    	if (error < 100) {
    		finished = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.INTAKEROTATEPID.disable();
    	Robot.INTAKEROTATE.Intake_Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.INTAKEROTATEPID.disable();
    	Robot.INTAKEROTATE.Intake_Stop();
    }
}
