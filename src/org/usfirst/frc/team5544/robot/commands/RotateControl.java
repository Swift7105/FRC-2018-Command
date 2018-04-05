package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.OI;
import org.usfirst.frc.team5544.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class RotateControl extends CommandGroup {

	Command Intake_Down;
	Command Intake_Vertical;
	Command Intake_Back;
	Command Intake_Switch;
	int pos;

	public RotateControl() {

		Intake_Down = new Intake_ME_Down();
		Intake_Back = new Intake_ME_Back();
		Intake_Vertical = new Intake_ME_Vertical();
		Intake_Switch = new Intake_ME_Switch();

		requires(Robot.DRIVETRAIN);
		requires(Robot.class);

		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}

	private void requires(Class<Robot> class1) {
		// TODO Auto-generated method stub

	}

	protected void execute() {


		if (pos == 1) {
			if (OI.Button2_1.get()) {

				Intake_Down.start();
				pos = 4;
				SmartDashboard.putString("Intake Position:", "Down");
				// Left Left Left
			}

			else if (OI.Button2_3.get()) {
				Intake_Switch.start();
				pos = 3;
				SmartDashboard.putString("Intake Position:", "Switch");
			}

			else if (OI.Button2_4.get()) {
				Intake_Vertical.start();
				pos = 2;
				SmartDashboard.putString("Intake Position:", "Vertical");
			}
		}

		if (pos == 2) {
			if (OI.Button2_1.get()) {

				Intake_Down.start();
				pos = 4;
				SmartDashboard.putString("Intake Position:", "Down");
				// Left Left Left
			}

			else if (OI.Button2_3.get()) {
				Intake_Switch.start();
				pos = 3;
				SmartDashboard.putString("Intake Position:", "Switch");
			}

			else if (OI.Button2_2.get()) {
				Intake_Back.start();
				pos = 1;
				SmartDashboard.putString("Intake Position:", "Back");
			}
			
		}
		
		if (pos == 3) {
			if (OI.Button2_1.get()) {

				Intake_Down.start();
				pos = 4;
				SmartDashboard.putString("Intake Position:", "Down");
				// Left Left Left
			}

			else if (OI.Button2_4.get()) {
				Intake_Vertical.start();
				pos = 4;
				SmartDashboard.putString("Intake Position:", "Vertical");
			}

			else if (OI.Button2_2.get()) {
				Intake_Back.start();
				pos = 1;
				SmartDashboard.putString("Intake Position:", "Back");
			}
			
		}
		
		if (pos == 4) {
			if (OI.Button2_4.get()) {

				Intake_Vertical.start();
				pos = 2;
				SmartDashboard.putString("Intake Position:", "Vertical");
				// Left Left Left
			}

			else if (OI.Button2_3.get()) {
				Intake_Switch.start();
				pos = 3;
				SmartDashboard.putString("Intake Position:", "Switch");
			}

			else if (OI.Button2_2.get()) {
				Intake_Back.start();
				pos = 1;
				SmartDashboard.putString("Intake Position:", "Back");
			}
			
		}

	}
}
