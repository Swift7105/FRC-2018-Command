package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class IntakeRotatePID extends PIDSubsystem {

	// Initialize your subsystem here
	public IntakeRotatePID() {
		super("Intake Encoder", 0.0005, 10000, 0.0);
		
		
		
		
		
		// Use these to get going:
		// setSetpoint() - Sets where the PID controller should move the system
		// to
		// enable() - Enables the PID controller.
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	protected double returnPIDInput() {
		return RobotMap.Intake.getDistance();
		// Return your input value for the PID loop
		// e.g. a sensor, like a potentiometer:
		// yourPot.getAverageVoltage() / kYourMaxVoltage;

	}

	protected void usePIDOutput(double output) {
		RobotMap.IntakeRotate.set(output);
		// Use output to drive your system, like a motor
		// e.g. yourMotor.set(output);
	}
}
