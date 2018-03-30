package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class EncoderRight extends Subsystem {
	Encoder Right = RobotMap.Right;

	// public double time2;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	char PCntrl(int target, int current) {

		double P = 1;
		double I = 0;
		double D = 0;

		int error = 0;
		double p_out = 0;

		error = target - current;

		p_out = error * P;

		if (p_out > 127)
			p_out = 127;
		if (p_out < -127)
			p_out = -127;

		return (char) (p_out + 127);
	}

	public void DriveRightPID(double target, double power) {
		double error = (target * 1040) - Right.getDistance();
		if (error > 5) {
			RobotMap.RightDriveBack.set(power);
			RobotMap.RightDriveFront.set(power);
			while (error > 100) {

			}
		} else if (error < 5) {
			RobotMap.RightDriveBack.set(-power);
			RobotMap.RightDriveFront.set(-power);
			while (error > 100) {

			}
		}

	}

	public void DriveStop() {
		RobotMap.LeftDriveFront.set(0);
		RobotMap.LeftDriveBack.set(0);
		RobotMap.RightDriveFront.set(0);
		RobotMap.RightDriveBack.set(0);
	}

}
