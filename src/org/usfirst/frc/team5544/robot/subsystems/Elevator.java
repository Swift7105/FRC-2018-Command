package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Up() {
    	RobotMap.ElevatorMotor.set(0.5);
    } 
    
    public void Down() {
    	RobotMap.ElevatorMotor.set(-0.5);
    }
    
    public void Stop() {
    	RobotMap.ElevatorMotor.set(0);
    }
    
    public void Manual(Double speed){
    	RobotMap.ElevatorMotor.set(speed);
    }
}

