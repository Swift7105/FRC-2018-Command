/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5544.robot;

import org.usfirst.frc.team5544.robot.commands.DumperIn;
import org.usfirst.frc.team5544.robot.commands.ElevatorDown;
import org.usfirst.frc.team5544.robot.commands.ElevatorScaleUp;
import org.usfirst.frc.team5544.robot.commands.IntakeInSlow;
import org.usfirst.frc.team5544.robot.commands.IntakeOutFull;
import org.usfirst.frc.team5544.robot.commands.Intake_Back;
import org.usfirst.frc.team5544.robot.commands.Intake_Down;
import org.usfirst.frc.team5544.robot.commands.Intake_Switch;
import org.usfirst.frc.team5544.robot.commands.Intake_Vertical;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick Joystick1 = new Joystick(1);
	public static Joystick Joystick2 = new Joystick(2);

	public static Button Button1_1 = new JoystickButton(Joystick1, 1);
	public static Button Button1_2 = new JoystickButton(Joystick1, 2);
	public static Button Button1_3 = new JoystickButton(Joystick1, 3);
	public static Button Button1_4 = new JoystickButton(Joystick2, 4);
	public static Button Button1_5 = new JoystickButton(Joystick2, 5);
	public static Button Button1_6 = new JoystickButton(Joystick1, 6);
	public static Button Button1_7 = new JoystickButton(Joystick2, 7);
	public static Button Button1_8 = new JoystickButton(Joystick2, 8);

	public static Button Button2_1 = new JoystickButton(Joystick2, 1);
	public static Button Button2_2 = new JoystickButton(Joystick2, 2);
	public static Button Button2_3 = new JoystickButton(Joystick2, 3);
	public static Button Button2_4 = new JoystickButton(Joystick2, 4);
	public static Button Button2_5 = new JoystickButton(Joystick2, 5);
	public static Button Button2_6 = new JoystickButton(Joystick2, 6);
	public static Button Button2_7 = new JoystickButton(Joystick2, 7);
	public static Button Button2_8 = new JoystickButton(Joystick2, 8);
	
	

	
	public OI() {

		Button1_1.whileHeld(new ElevatorScaleUp());
		Button1_2.whileHeld(new ElevatorDown());
		Button1_6.whileHeld(new DumperIn());

		Button2_5.whileHeld(new IntakeInSlow());
		Button2_6.whileHeld(new IntakeOutFull());

		Button2_1.whenPressed(new Intake_Back());
		Button2_4.whenPressed(new Intake_Vertical());
		Button2_2.whenPressed(new Intake_Down());
		Button2_3.whenPressed(new Intake_Switch());
		
		

		/*
		 * Button2_2.whileHeld(new IntakeInSlow()); Button2_4.whileHeld(new
		 * IntakeOutFull()); Button2_1.whileHeld(new IntakeSame());
		 * Button2_3.whileHeld(new IntakeInFull());
		 */

	}

	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
