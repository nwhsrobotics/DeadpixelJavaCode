/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class GrabberSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  
  private WPI_TalonSRX s_talon;
  private WPI_TalonSRX c_talon;
  private SpeedControllerGroup g_talon;
  

  public GrabberSubsystem() {
   
  
    s_talon = new WPI_TalonSRX(2);
    s_talon.set(ControlMode.PercentOutput, 0.0);
   
    c_talon = new WPI_TalonSRX(9);
    c_talon.set(ControlMode.PercentOutput, 0.0);

    c_talon.setInverted(true);

    g_talon = new SpeedControllerGroup(s_talon, c_talon);


    
  
    
    
    }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  


  public void open() {
    g_talon.set(0.2);
  }

  public void close() {
    g_talon.set(-0.2);
  }




}






