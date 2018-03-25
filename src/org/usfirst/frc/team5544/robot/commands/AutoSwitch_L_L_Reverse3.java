package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoSwitch_L_L_Reverse3 extends Command {

	public AutoSwitch_L_L_Reverse3() {
		requires(Robot.DRIVELEFTPID);
		requires(Robot.DRIVERIGHTPID);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.DRIVELEFTPID.setSetpoint(1000);
		Robot.DRIVERIGHTPID.setSetpoint(1000);
		Robot.DRIVELEFTPID.enable();
		Robot.DRIVERIGHTPID.enable();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Math.abs(Robot.DRIVELEFTPID.getSetpoint() - Robot.DRIVELEFTPID.getPosition()) < 100
				|| Math.abs(Robot.DRIVERIGHTPID.getSetpoint() - Robot.DRIVERIGHTPID.getPosition()) < 100;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.DRIVELEFTPID.disable();
		Robot.DRIVERIGHTPID.disable();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.DRIVELEFTPID.disable();
		Robot.DRIVERIGHTPID.disable();
	}
}
