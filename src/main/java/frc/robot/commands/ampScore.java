package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.scoreWheels;

public class ampScore extends Command {
    
    private final scoreWheels m_ampScore;
    
    public ampScore(scoreWheels subsystem){    
        m_ampScore = subsystem;
        addRequirements(m_ampScore);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        m_ampScore.runShooter(Constants.ShooterConstants.topAmpMotorVelocity, Constants.ShooterConstants.bottomAmpMotorVelocity);
    }

    @Override
    public void end(boolean interrupted) {
        m_ampScore.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;
    }
}