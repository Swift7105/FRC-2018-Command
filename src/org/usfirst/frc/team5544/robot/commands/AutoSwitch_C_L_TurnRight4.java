package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;
import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoSwitch_C_L_TurnRight4 extends Command {
	double target = 10000;
	double error;
	boolean finished;

	public AutoSwitch_C_L_TurnRight4() {
		requires(Robot.DRIVETRAIN);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		RobotMap.Left.reset();
		RobotMap.Right.reset();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		finished = false;
		Robot.DRIVELEFTPID.setSetpoint(1000);
		Robot.DRIVERIGHTPID.setSetpoint(-1000);
		Robot.DRIVELEFTPID.enable();
		Robot.DRIVERIGHTPID.enable();
		finished = true;
		
		
		/*	SmartDashboard.putString("Dubug 3", "Encoder Logic");
		if (error > 100) {
			SmartDashboard.putString("Dubug 4", "We are reading the encoder");
			Robot.DRIVETRAIN.DriveReverseRight();
		}
		if (error < 100) {
			finished = true;
		}*/


	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return (Math.abs(target - RobotMap.Left.getDistance()) > 10
				|| Math.abs(target - RobotMap.Right.getDistance()) > 10);
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.DRIVELEFTPID.disable();
		Robot.DRIVERIGHTPID.disable();
		Robot.DRIVETRAIN.DriveStop();

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.DRIVELEFTPID.disable();
		Robot.DRIVERIGHTPID.disable();
		Robot.DRIVETRAIN.DriveStop();
	}
}
