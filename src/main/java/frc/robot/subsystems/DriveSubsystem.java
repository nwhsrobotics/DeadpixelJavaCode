/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.commands.DriveTeleopCommand;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  
    WPI_TalonSRX m_frontleft;
    WPI_TalonSRX m_frontright;
    WPI_TalonSRX m_backright;
    WPI_TalonSRX m_backleft;
    SpeedControllerGroup m_left;
    SpeedControllerGroup m_right;
    DifferentialDrive m_drive;

    private Joystick m_js = new Joystick(0);

    public DriveSubsystem() {
      m_frontleft = new WPI_TalonSRX(11);
      m_frontright = new WPI_TalonSRX(10);
      m_backright = new WPI_TalonSRX(7);
      m_backleft = new WPI_TalonSRX(13);

      m_left = new SpeedControllerGroup(m_frontleft, m_backleft);
      m_right = new SpeedControllerGroup(m_frontright, m_backright);
      
     

      

      m_drive = new DifferentialDrive(m_left, m_right);
      m_drive.arcadeDrive(0.0, 0.0);
    }

    

    


      
    
    public void periodic() {
      double throttle = m_js.getRawAxis(1);
      double turn = m_js.getRawAxis(4);

      m_drive.arcadeDrive(throttle, turn);

      setDefaultCommand(new DriveTeleopCommand());
    }



    
      
    
      @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    }
  }
