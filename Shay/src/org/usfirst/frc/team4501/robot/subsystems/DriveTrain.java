package org.usfirst.frc.team4501.robot.subsystems;

import org.usfirst.frc.team4501.robot.RobotMap;
import org.usfirst.frc.team4501.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	Talon talon1, talon2, talon3, talon4;
	RobotDrive drive;
	
	public DriveTrain(){
		talon1 = new Talon(RobotMap.TALON1);
		talon2 = new Talon(RobotMap.TALON2);
		talon3 = new Talon(RobotMap.TALON3);
		talon4 = new Talon(RobotMap.TALON4);
		drive = new RobotDrive(talon1, talon2, talon3, talon4);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void drive(double moveValue, double rotateValue){
		drive.arcadeDrive(moveValue, rotateValue);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
}

