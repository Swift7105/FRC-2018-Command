package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeRotate extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// setDefaultCommand(new Intake_Rotate_Stay());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void Intake_In() {
		RobotMap.IntakeRotate.set(0.5);
	}

	public void Intake_Out() {
		RobotMap.IntakeRotate.set(-0.45);
	}

	public void Intake_Stop() {
		RobotMap.IntakeRotate.set(0);
	}

	public void Intake_Manual(double speed) {
		RobotMap.IntakeRotate.set(speed);
	}

	public void Intake_Stay() {
		RobotMap.IntakeRotate.set(0.30);
	}

	public void Intake_Auto() {
		RobotMap.IntakeRotate.set(-0.45);
	}
}
