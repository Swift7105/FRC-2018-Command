package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForward4seconds extends Command {
boolean Isitfinished;

    public DriveForward4seconds() {
    	requires(Robot.DRIVETRAIN);
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Isitfinished = false;
    	Robot.DRIVETRAIN.DriveForward();
    	Timer.delay(4);
    	Robot.DRIVETRAIN.DriveStop();
    	Isitfinished = true;
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Isitfinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.DRIVETRAIN.DriveStop();
    }
}
