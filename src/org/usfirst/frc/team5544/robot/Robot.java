/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5544.robot;

import org.usfirst.frc.team5544.robot.commands.MainAutoCrossLine;
import org.usfirst.frc.team5544.robot.commands.MainAutoPrioritizeSwitch;
import org.usfirst.frc.team5544.robot.commands.MainAutoPriority;
import org.usfirst.frc.team5544.robot.commands.MainAutoScale;
import org.usfirst.frc.team5544.robot.commands.MainAutoSwitch;
import org.usfirst.frc.team5544.robot.commands.MainAutoTestTurning;
import org.usfirst.frc.team5544.robot.subsystems.DriveLeftPID;
import org.usfirst.frc.team5544.robot.subsystems.DriveRightPID;
import org.usfirst.frc.team5544.robot.subsystems.Drivetrain;
import org.usfirst.frc.team5544.robot.subsystems.Dumper;
import org.usfirst.frc.team5544.robot.subsystems.Elevator;
import org.usfirst.frc.team5544.robot.subsystems.Intake;
import org.usfirst.frc.team5544.robot.subsystems.IntakeRotate;
import org.usfirst.frc.team5544.robot.subsystems.IntakeRotatePID;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {

	public static OI m_oi;
	public static String Pos;
	public static final Elevator ELEVATOR = new Elevator();
	public static final Drivetrain DRIVETRAIN = new Drivetrain();
	public static final Intake INTAKE = new Intake();
	public static final Dumper DUMPER = new Dumper();
	public static final IntakeRotate INTAKEROTATE = new IntakeRotate();
	public static final IntakeRotatePID INTAKEROTATEPID = new IntakeRotatePID();
	public static final DriveLeftPID DRIVELEFTPID = new DriveLeftPID();
	public static final DriveRightPID DRIVERIGHTPID = new DriveRightPID();
	
	
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	SendableChooser<String> StartingPosition = new SendableChooser<>();

	PowerDistributionPanel pdp = new PowerDistributionPanel();
	
	double input = pdp.getVoltage();
	
	double TimeRemaining = DriverStation.getInstance().getMatchTime();

	public double drivetime;
	

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override

	public void robotInit() {

		m_oi = new OI();
		m_chooser.addObject("Automatic Priority", new MainAutoPriority());
		m_chooser.addDefault("Prioritize Switch", new MainAutoPrioritizeSwitch());
		m_chooser.addObject("Cross The Auto Line", new MainAutoCrossLine());
		m_chooser.addObject("Dump In the Switch", new MainAutoSwitch());
		m_chooser.addObject("Auto Switch One Cube", new MainAutoScale());
		m_chooser.addObject("Turn Testing", new MainAutoTestTurning());
		
		SmartDashboard.putData("Auto Mode", m_chooser);

		StartingPosition.addObject("Left", "L");
		StartingPosition.addDefault("Center", "C");
		StartingPosition.addObject("Right", "R");
		SmartDashboard.putData("Starting Position", StartingPosition);
		CameraServer.getInstance().startAutomaticCapture();
		// SmartDashboard.putData("Voltage", Robot.);

		SmartDashboard.putNumber("PDP Input", input);
		RobotMap.Intake.reset();
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	@Override
	public void disabledInit() {
		RobotMap.Intake.reset();

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		RobotMap.Intake.reset();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString code to get the
	 * auto name from the text box below the Gyro
	 *
	 * <p>
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		m_autonomousCommand = m_chooser.getSelected();
		Pos = StartingPosition.getSelected();
		SmartDashboard.putString("Location", Pos);
		RobotMap.Intake.reset();
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		 * switch(autoSelected) { case "My Auto": autonomousCommand = new
		 * MyAutoCommand(); break; case "Default Auto": default: autonomousCommand = new
		 * ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (m_autonomousCommand != null & Pos != null) {
			m_autonomousCommand.start();
		}
		
		SmartDashboard.putNumber("Distance Left", RobotMap.Left.getDistance());
		SmartDashboard.putNumber("Distance Right", RobotMap.Right.getDistance());

	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		SmartDashboard.putNumber("Time Remaining", TimeRemaining);
		SmartDashboard.getBoolean("Encoder", RobotMap.Left.getDirection());
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
		
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Robot.DRIVETRAIN.TankDrive(-OI.Joystick1.getRawAxis(1), OI.Joystick1.getRawAxis(5));
	//	Robot.INTAKEROTATE.Intake_Manual(-OI.Joystick2.getRawAxis(1) * 0.58);
		// down
		if (-OI.Joystick2.getRawAxis(5) > 0) {
			Robot.ELEVATOR.Manual(-OI.Joystick2.getRawAxis(5) * 0.85);
		}
		// down
		else if (-OI.Joystick2.getRawAxis(5) < 0) {
			Robot.ELEVATOR.Manual(-OI.Joystick2.getRawAxis(5) * 0.75);
		}
		
		//Robot.DUMPER.Manual(-OI.Joystick1.getRawAxis(2));
		Robot.DUMPER.Manual(OI.Joystick1.getRawAxis(3)*0.75);
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("IntakePos:", RobotMap.Intake.getDistance());
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
