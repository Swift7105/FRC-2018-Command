package org.usfirst.frc.team5544.robot.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team5544.robot.RobotMap;

/**
 *
 */
public class DrivetrainRightPID extends PIDSubsystem {

	Talon RightFront = RobotMap.RightDriveFront;
	Talon RightBack = RobotMap.RightDriveBack;
	
	
	Encoder Right = RobotMap.Right;
	
	
    // Initialize your subsystem here
    public DrivetrainRightPID() {
    	super("DrivetrainRight",0.0,0.0,0.0);
    	setOutputRange(-0.5,0.5);
    	setInputRange(-5,10000);
    	setAbsoluteTolerance(0.5);
    
    	
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    protected double returnPIDInput() {
    	Right.getDistance();
    	
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }

    protected void usePIDOutput(double output) {
    	RightFront.pidWrite(output);
    	RightBack.pidWrite(output);
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
