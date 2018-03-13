package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Red| Team Side MG", group="RED")
public class RedAutoTeamSideMG extends DeclarationsAutonomous {
    @Override
    public void runOpMode() {
        super.runOpMode();
        knockOffJewel("RED", 3);
        EncoderDrive(.2,  24, Forward, stayOnHeading, 5);
        gyroTurn(.215, -90);
        driveAndPlace(CryptoKey, Forward, TeamSide, 0, 3);
        ramThePitTeamSide(3, Forward);
        endAuto();


    }
}