package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;
import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake_Back extends Command {
	boolean finished;
	double setpoint = -6;
	double error = Math.abs(setpoint - RobotMap.Intake.getDistance());

	public Intake_Back() {
		requires(Robot.INTAKEROTATEPID);

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.INTAKEROTATEPID.setSetpoint(setpoint);
		Robot.INTAKEROTATEPID.enable();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Math.abs(Robot.INTAKEROTATEPID.getSetpoint() - Robot.INTAKEROTATEPID.getPosition()) < setpoint;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.INTAKEROTATE.Intake_Stop();
		Robot.INTAKEROTATEPID.disable();
	}
}
