package org.firstinspires.ftc.teamcode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Red| Relic Side MG", group="RED")
public class RedAutoRelicSideMG extends DeclarationsAutonomous {
    @Override
    public void runOpMode() {
        super.runOpMode();
        knockOffJewel("RED", 4);
        driveAndPlace(CryptoKey, Forward, RelicSide, 0, 4);
        MGAutoRelicSide(4, Forward, 1);
    }
}