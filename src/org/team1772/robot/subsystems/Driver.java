package org.team1772.robot.subsystems;

import org.team1772.Core.components.GearBox;
import org.team1772.Core.components.SmartNavx;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Driver extends Subsystem {
	// Components
	private GearBox leftGearBox, rightGearBox;
	private SmartNavx navx;
	private DigitalInput sensor;

    public Driver () {
    	leftGearBox  = new GearBox(new Talon(1), new Encoder(2, 3), 0.02662830636845544737048296408458);
    	rightGearBox = new GearBox(new Talon(0), new Encoder(0, 1), true, 0.0265748358737396733797791830322);
		navx         = new SmartNavx();
		sensor		 = new DigitalInput(5);

		rightGearBox.setEncoderInverted(true);
    }
    
    public double getLeftPulses() {
    	return leftGearBox.getPulses();
    }
    
    public double getRightPulses() {
    	return rightGearBox.getPulses();
    }
    
    public double getLeftDistance() {
    	return leftGearBox.getDistance();
    }

    public double getRightDistance() {
    	return rightGearBox.getDistance();
    }

    public double getAngle() {
    	return navx.getAngle();
    }
    
    public boolean isGearInLift() {
    	return sensor.get();
    }
    
    public boolean reset() {
    	//rightGearBox.reset();
    	//leftGearBox.reset();
    	//navx.reset();
    	return true;
    }
    
    public boolean setSpeed(double left, double right) {
    	leftGearBox.setSpeed(-left);
		rightGearBox.setSpeed(-right);
		
		return true;
    }

	public void print(boolean inline) {
    	// SmartDashboard.putNumber("leftEncoder pulses", leftGearBox.getPulses());
    	// SmartDashboard.putNumber("rightEncoder pulses", rightGearBox.getPulses());
    	SmartDashboard.putNumber("leftEncoder distance", leftGearBox.getDistance());
    	SmartDashboard.putNumber("rightEncoder distance", rightGearBox.getDistance());
    	SmartDashboard.putNumber("navx angle", navx.getAngle());
    	
    	if (inline)
    		System.out.println("left in: " + leftGearBox.getDistance() + " right in: " + rightGearBox.getDistance() + " angle: " + navx.getAngle());
    }
	public void print() {
    	this.print(false);
    }

	double minR = 0.4D, difR = 0.5D;
	public void arcadeDrive(double sp, double rotation) {
		double mod = minR + difR * Math.pow(1 - Math.abs(sp), 2);
		double r = Math.pow(rotation, 3) * mod;
		leftGearBox.setSpeed(sp - r);
		rightGearBox.setSpeed(sp + r);
	}
	
	@Override
	protected void initDefaultCommand() {}
}
