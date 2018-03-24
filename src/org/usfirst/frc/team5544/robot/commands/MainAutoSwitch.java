package org.usfirst.frc.team5544.robot.commands;

import org.usfirst.frc.team5544.robot.Robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class MainAutoSwitch extends CommandGroup {
	
	Command AutoSwitchL_L;
	Command AutoSwitchL_R;
	Command AutoSwitchC_L;
	Command AutoSwitchC_R;	
	Command AutoSwitchR_L;
	Command AutoSwitchR_R;

    public MainAutoSwitch() {
    	
    	AutoSwitchL_L = new AutoSwitchL_L();
    	AutoSwitchL_R = new AutoSwitchL_R();
    	AutoSwitchC_L = new AutoSwitchC_L();
    	AutoSwitchC_R = new AutoSwitchC_R();
    	AutoSwitchR_L = new AutoSwitchR_L();
    	AutoSwitchR_R = new AutoSwitchR_R();

    	requires(Robot.DRIVETRAIN);
    	requires(Robot.class);
    	
    	
    	
    
    	
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

	private void requires(Class<Robot> class1) {
		// TODO Auto-generated method stub
		
	}
	protected void execute(){
		

		
		String GameData = DriverStation.getInstance().getGameSpecificMessage();
		
	
		
		if(Robot.Pos.equals("L")) {
			if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			
        				//Left Left Left
        				AutoSwitchL_L.start();
        				SmartDashboard.putString("Running:","Auto Switch Left On Left" );
        						}
        		}
    		else if(GameData.charAt(0)=='R'){
    			AutoSwitchL_R.start();
				SmartDashboard.putString("Running:","Auto Switch Right On Left" );
			
    		}
    	}
    	
		if(Robot.Pos.equals("C")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			
        				//Left Left Left
        				AutoSwitchC_L.start();
        				SmartDashboard.putString("Running:","Auto Switch Left On Center" );
        						}
        		}
    		else if(GameData.charAt(0)=='R'){
    			AutoSwitchC_L.start();
				SmartDashboard.putString("Running:","Auto Switch Left On Center" );
			
    		}
        		
        				}
        	    	
    	
    	
		if(Robot.Pos.equals("R")) {
    		if(GameData.length()>0) {
        		if(GameData.charAt(0)=='L') {
        			
        				//Left Left Left
        				AutoSwitchR_L.start();
        				SmartDashboard.putString("Running:","Auto Switch Right On Right" );
        						}
        		}
    		else if(GameData.charAt(0)=='R'){
    			AutoSwitchR_R.start();
				SmartDashboard.putString("Running:","Auto Switch Right On Rigt" );
			
    		}
    			}
    		
		
		}
	}
	
	
	


