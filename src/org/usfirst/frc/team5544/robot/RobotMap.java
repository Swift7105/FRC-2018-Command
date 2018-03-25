/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5544.robot;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static Spark ElevatorMotor = new Spark(6);
	public static Spark IntakeRight = new Spark(9);
	public static Spark IntakeLeft = new Spark(8);
	public static Spark IntakeSecondary = new Spark(7);
	public static Spark Dumper = new Spark(5);
	public static Spark IntakeRotate = new Spark(4);
	
	public static Talon LeftDriveFront = new Talon(1);
	public static Talon LeftDriveBack = new Talon(2);
	public static Talon RightDriveFront = new Talon(0);
	public static Talon RightDriveBack = new Talon(3);
	
	
	public static Encoder Left = new Encoder(0, 1, false, EncodingType.k1X);
	public static Encoder Right = new Encoder(3, 4, true, EncodingType.k1X);
	public static Encoder Intake = new Encoder(5, 6, false, EncodingType.k1X);
	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
