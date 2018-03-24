package org.usfirst.frc.team5544.robot.subsystems;

import org.usfirst.frc.team5544.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Dumper extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void DumperOut() {
    	RobotMap.Dumper.set(-0.75);
    	
    }
    public void DumperIn() {
    	RobotMap.Dumper.set(0.75);
    	
    }
    public void DumperStop() {
    	RobotMap.Dumper.set(0);
    }
    
    public void Manual(double speed){
    	RobotMap.Dumper.set(speed);
    }
}

