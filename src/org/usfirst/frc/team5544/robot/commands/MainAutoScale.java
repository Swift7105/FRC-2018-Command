package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MainAutoScale extends CommandGroup {

	
	Command AutoScaleL_L;
	Command AutoScaleL_R;
	Command AutoScaleC_L;
	Command AutoScaleC_R;	
	Command AutoScaleR_L;
	Command AutoScaleR_R;
	
    public MainAutoScale() {
    	
    	
    	AutoScaleL_L = new AutoScaleL_L();
    	AutoScaleL_R = new AutoScaleL_R();
    	AutoScaleC_L = new AutoScaleC_L();
    	AutoScaleC_R = new AutoScaleC_R();
    	AutoScaleR_L = new AutoScaleR_L();
    	AutoScaleR_R = new AutoScaleR_R();
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
protected void execute(){
		

		requires(Robot.DRIVETRAIN);
		requires(Robot.class);
		String GameData = DriverStation.getInstance().getGameSpecificMessage();
		
	
		
		if(Robot.Pos.equals("L")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			if(GameData.charAt(1)=='L') {
        				//Left Left Left
        				
        				AutoScaleL_L.start();
        				SmartDashboard.putString("Running:","Scale Left on Left" );
        				
        				
        			}
        			else 
        				if(GameData.charAt(1)=='R') {
        					
        					AutoScaleL_R.start();
            				SmartDashboard.putString("Running:","Scale Right on Left" );

        				
        				//Left Right Left
        				/*Robot.DRIVETRAIN.DriveForward();
        				Timer.delay(1);
        				Robot.DRIVETRAIN.Right90();
        				Robot.DRIVETRAIN.DriveForward();
        				Timer.delay(5);
        				Robot.DRIVETRAIN.Left90();
        				Robot.DRIVETRAIN.DriveForward();
        				Timer.delay(2);
        				Robot.DRIVETRAIN.Right90();
        				Robot.ELEVATOR.Up();
        				Timer.delay(2);
        				Robot.DUMPER.DumperOut();
        				Robot.DUMPER.DumperIn();
        				Robot.ELEVATOR.Down();
        				Timer.delay(1.5);*/
    
        				
        			}
        		}
        		
        		else {
        			if(GameData.charAt(0)=='R') {
        				if(GameData.charAt(1)=='L'){
        					//Right Left Right
        					
        					AutoScaleL_L.start();
            				SmartDashboard.putString("Running:","Scale Left on Left" );

        					/*Robot.DRIVETRAIN.DriveForward();
            				Timer.delay(3);
            				Robot.DRIVETRAIN.Left90();
            				Robot.DRIVETRAIN.DriveForward();
            				Timer.delay(2);
            				Robot.DRIVETRAIN.Right90();
            				Robot.DRIVETRAIN.DriveForward();
            				Timer.delay(4);
            				Robot.DRIVETRAIN.Left90();
            				Robot.ELEVATOR.Up();
            				Timer.delay(2);
            				Robot.DUMPER.DumperOut();
            				Robot.DUMPER.DumperIn();
            				Robot.ELEVATOR.Down();
            				Timer.delay(1.5);*/
        					
        				}
        			
        		else
        			if(GameData.charAt(1)=='R') {
        				//Right Right Right
        				
        				
        				AutoScaleL_R.start();
        				SmartDashboard.putString("Running:","Scale Right on Left" );

        				/*Robot.DRIVETRAIN.DriveForward();
        				Timer.delay(1);
        				Robot.DRIVETRAIN.Right90();
        				Robot.DRIVETRAIN.DriveForward();
        				Timer.delay(5);
        				Robot.DRIVETRAIN.Left90();
        				Robot.DRIVETRAIN.DriveForward();
        				Timer.delay(2);
        				Robot.DRIVETRAIN.Right90();
        				Robot.ELEVATOR.Up();
        				Timer.delay(2);
        				Robot.DUMPER.DumperOut();
        				Robot.DUMPER.DumperIn();
        				Robot.ELEVATOR.Down();
        				Timer.delay(1.5);*/
        				
        			}
        		}
        	}
    	}
	}
    	
		if(Robot.Pos.equals("C")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			if(GameData.charAt(1)=='L') {
        				//Left Left Left
        				AutoScaleC_L.start();
        				SmartDashboard.putString("Running:","Scale Left on Center" );

        				
        			}
        			else 
        				if(GameData.charAt(1)=='R') {
        				//Left Right Left
        				AutoScaleC_R.start();
        				SmartDashboard.putString("Running:","Scale Right on Center" );

        				
        			}
        		}
        		
        		else {
        			if(GameData.charAt(0)=='R') {
        				if(GameData.charAt(1)=='L'){
        					//Right Left Right
        					AutoScaleC_L.start();
            				SmartDashboard.putString("Running:","Scale Left on Center" );

        				}
        			
        		else
        			if(GameData.charAt(1)=='R') {
        				//Right Right Right
        				AutoScaleC_R.start();
        				SmartDashboard.putString("Running:","Scale Right on Center" );

        			}
        		}
        	}
    	}
    	}
    	
		if(Robot.Pos.equals("R")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			if(GameData.charAt(1)=='L') {
        				//Left Left Left
        				AutoScaleR_L.start();
        				SmartDashboard.putString("Running:","Scale Left on Right" );

        			}
        			else 
        				if(GameData.charAt(1)=='R') {
        				//Left Right Left
        					AutoScaleR_R.start();
            				SmartDashboard.putString("Running:","Scale Right on Right" );

        					
        			}
        		}
        		
        		else {
        			if(GameData.charAt(0)=='R') {
        				if(GameData.charAt(1)=='L'){
        					//Right Left Right
        					AutoScaleR_L.start();
            				SmartDashboard.putString("Running:","Scale Left on Right" );

        				}
        			
        		else
        			if(GameData.charAt(1)=='R') {
        				//Right Right Right
        				AutoScaleR_R.start();
        				SmartDashboard.putString("Running:","Scale Right on Right" );

        			}
        		}
        	}
        			}
    			}
    		
		
		}
private void requires(Class<Robot> class1) {
	// TODO Auto-generated method stub
	
}
	}

