package org.firstinspires.ftc.teamcode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
@Autonomous(name="BLUE| Right Side regular", group="BLUE")
public class BlueAutoRelicSide extends DeclarationsAutonomous {
    @Override
    public void runOpMode() {
        super.runOpMode();
        knockOffJewel("BLUE",1);
        driveAndPlace(CryptoKey, Reverse, RelicSide, 0,1);
        endAuto();
    }
}