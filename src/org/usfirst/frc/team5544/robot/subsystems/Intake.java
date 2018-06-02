package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	public double time;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public  void IntakeInSlow(){
    	RobotMap.IntakeLeft.set(-.3);
    	RobotMap.IntakeRight.set(.3);
    }
    
    public void IntakeInFull() {
    	RobotMap.IntakeLeft.set(-0.30);
    	RobotMap.IntakeRight.set(0.30);
    	
    }
    
    public void IntakeInVariable(double speedprimary, double speedsecondary, double time) {
    	RobotMap.IntakeLeft.set(speedprimary);
    	RobotMap.IntakeRight.set(speedprimary);
    	RobotMap.IntakeSecondary.set(speedsecondary);
    	Timer.delay(time);
    }
    
    public void IntakeOutVariable(double speedprimary, double speedsecondary, double time) {
    	RobotMap.IntakeLeft.set(speedprimary);
    	RobotMap.IntakeRight.set(speedprimary);
    	RobotMap.IntakeSecondary.set(speedsecondary);
    	Timer.delay(time);
    }
    
    public void IntakeOutSlow(){
    	RobotMap.IntakeLeft.set(.25);
    	RobotMap.IntakeRight.set(-.25);
    	RobotMap.IntakeSecondary.set(-1);
    }
    
    public void IntakeOutFull() {
    	RobotMap.IntakeLeft.set(1);
    	RobotMap.IntakeRight.set(-1);
    	RobotMap.IntakeSecondary.set(-1);
    }
    
    public void IntakeStop() {
    	RobotMap.IntakeLeft.set(0);
    	RobotMap.IntakeRight.set(0);
    	RobotMap.IntakeSecondary.set(0);
    }
    
    public void IntakeTurn() {
    	RobotMap.IntakeLeft.set(0.25);
    	RobotMap.IntakeRight.set(0.25);
    }
    
    
}

