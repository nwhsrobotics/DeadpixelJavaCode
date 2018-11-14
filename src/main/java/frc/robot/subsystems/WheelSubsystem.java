/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class WheelSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private SpeedController Wheels;
  private WPI_TalonSRX t_talon;
  private WPI_TalonSRX m_talon;
  
  
  public WheelSubsystem() {



    m_talon = new WPI_TalonSRX(3);
    m_talon.set(ControlMode.PercentOutput, 0.0);

    t_talon = new WPI_TalonSRX(8);
    t_talon.set(ControlMode.PercentOutput, 0.0);

    Wheels = new SpeedControllerGroup(m_talon, t_talon);

  }


    

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());


  
      
    }
  
  
      
    
  
  public void start() {
    Wheels.set(0.7);
}

  public void stop() {
    Wheels.set(0.0);
}

  public void reverse() {
    Wheels.set(-0.7);
}





}






