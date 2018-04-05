package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;
import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Intake_ME_Back extends Command {
boolean finished;

	public Intake_ME_Back() {
		requires(Robot.INTAKEROTATE);
		

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if(RobotMap.Intake.getDistance() > -6) {
			RobotMap.IntakeRotate.set(-0.2);
		}
		else if(RobotMap.Intake.getDistance() < -6) {
			RobotMap.IntakeRotate.set(0.2);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.INTAKEROTATE.Intake_Stop();
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.INTAKEROTATE.Intake_Stop();
		
	}
}
