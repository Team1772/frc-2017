
package org.team1772.robot;

import org.team1772.robot.routines.*;
import org.team1772.robot.subsystems.*;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

	public static Driver driver;
	public static IntakeGear intakeGear;
	public static Climb climb;
	private Compressor comp;
	
    public void robotInit() {
    	driver     = new Driver();
    	intakeGear = new IntakeGear();
    	climb      = new Climb();
    	comp 	   = new Compressor();
    	comp.start();

    	Auton.INSTANCE.init();
    }

    public void autonomousInit() {
    	driver.reset();
    	Auton.INSTANCE.start();
    }

    public void autonomousPeriodic() {
    	Auton.INSTANCE.periodic();
    }
    
    public void teleopInit() {
    	Auton.INSTANCE.cancel();
    	Teleop.INSTANCE.init();
    }

    public void teleopPeriodic() {
    	Teleop.INSTANCE.periodic();
    }
    
    @Override
    public void disabledInit() {
    	driver.setSpeed(0, 0);
    	climb.setSpeed(0);
    }
}