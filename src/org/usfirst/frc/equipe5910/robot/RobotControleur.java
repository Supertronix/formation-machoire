package org.usfirst.frc.equipe5910.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Servo;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotControleur extends IterativeRobot {

	public static final int MACHOIRE_GAUCHE_SERVO = 1; // Servo 1
	public static final int MACHOIRE_DROITE_SERVO = 0; // Servo 2
	
	public static final double MACHOIRE_GAUCHE_FERMEE = 0.0;
	public static final double MACHOIRE_DROITE_FERMEE = 0.0;
	public static final double MACHOIRE_GAUCHE_OUVERTE = 1.0;
	public static final double MACHOIRE_DROITE_OUVERTE = 1.0;
	
	Servo verrouMachoireGauche;
	Servo verrouMachoireDroite;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 * 
	 */
	@Override
	public void robotInit() {
		System.out.println("robotInit()");
		verrouMachoireGauche = new Servo(MACHOIRE_GAUCHE_SERVO);
		verrouMachoireDroite = new Servo(MACHOIRE_DROITE_SERVO);
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() {
		System.out.println("autonomousInit()");
		// Ouvrir la machoire en mode autonome
		verrouMachoireGauche.set(MACHOIRE_GAUCHE_OUVERTE);
		verrouMachoireDroite.set(MACHOIRE_DROITE_OUVERTE);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		System.out.println("autonomousPeriodic()");
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() {
		System.out.println("teleopInit()");
		// Fermer la machoire en mode teleop
		verrouMachoireGauche.set(MACHOIRE_GAUCHE_FERMEE);
		verrouMachoireDroite.set(MACHOIRE_DROITE_FERMEE);
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		System.out.println("teleopPeriodic()");
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		System.out.println("testPeriodic()");
	}
	
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testInit() {
		System.out.println("testInit()");
	}
	
}
