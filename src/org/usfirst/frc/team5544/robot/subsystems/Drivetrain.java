package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
//public double time2;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void TankDrive(double speedleft,double speedright) {
    	RobotMap.LeftDriveFront.set(speedleft * speedleft * speedleft);
    	RobotMap.LeftDriveBack.set(speedleft * speedleft * speedleft);
    	RobotMap.RightDriveFront.set(speedright * speedright * speedright);
    	RobotMap.RightDriveBack.set(speedright * speedright * speedright);
    }   
    
    public  void DriveForward(){
    	RobotMap.LeftDriveFront.set(0.65);
    	RobotMap.LeftDriveBack.set(0.65);
    	RobotMap.RightDriveFront.set(-0.65);
    	RobotMap.RightDriveBack.set(-0.65);
    }
    
    public void DriveForwardBlock(){
    	RobotMap.LeftDriveFront.set(0.35);
    	RobotMap.LeftDriveBack.set(0.35);
    	RobotMap.RightDriveFront.set(-0.35);
    	RobotMap.RightDriveBack.set(-0.35);
    }
    
    public void DriveReverseLeft() {
    	RobotMap.LeftDriveFront.set(-0.50);
    	RobotMap.LeftDriveBack.set(-0.50);
    	RobotMap.RightDriveFront.set(0.50);
    	RobotMap.RightDriveBack.set(0.50);
    }
    
    public void DriveReverseRight() {
    	RobotMap.LeftDriveFront.set(-0.50);
    	RobotMap.LeftDriveBack.set(-0.50);
    	RobotMap.RightDriveFront.set(0.50);
    	RobotMap.RightDriveBack.set(0.50);
    }
    
    public void DriveReverseSlow() {
    	RobotMap.LeftDriveFront.set(-0.25);
    	RobotMap.LeftDriveBack.set(-0.25);
    	RobotMap.RightDriveFront.set(0.25);
    	RobotMap.RightDriveBack.set(0.25);
    }
    
    public void DriveTurn(double speedleft, double speedright){
    	RobotMap.LeftDriveFront.set(speedleft);
    	RobotMap.LeftDriveBack.set(speedleft);
    	RobotMap.RightDriveFront.set(speedright);
    	RobotMap.RightDriveBack.set(speedright);
    }
    
    public void Right90(){
    	RobotMap.LeftDriveFront.set(0.75);
    	RobotMap.LeftDriveBack.set(0.75);
    	RobotMap.RightDriveFront.set(0.75);
    	RobotMap.RightDriveBack.set(0.75);
    	
    }
    
    public void Left90(){
    	RobotMap.LeftDriveFront.set(-0.75);
    	RobotMap.LeftDriveBack.set(-0.75);
    	RobotMap.RightDriveFront.set(-0.75);
    	RobotMap.RightDriveBack.set(-0.75);
    
    }
    
    public void Right45(){
    	RobotMap.LeftDriveFront.set(0.50);
    	RobotMap.LeftDriveBack.set(0.50);
    	RobotMap.RightDriveFront.set(0.50);
    	RobotMap.RightDriveBack.set(0.50);
    	
    }
    
    public void Left45(){
    	RobotMap.LeftDriveFront.set(-0.50);
    	RobotMap.LeftDriveBack.set(-0.50);
    	RobotMap.RightDriveFront.set(-0.50);
    	RobotMap.RightDriveBack.set(-0.50);
    
    }
    
    public void DriveStop(){
    	RobotMap.LeftDriveFront.set(0);
    	RobotMap.LeftDriveBack.set(0);
    	RobotMap.RightDriveFront.set(0);
    	RobotMap.RightDriveBack.set(0);
    }
    
    
    
    
}

