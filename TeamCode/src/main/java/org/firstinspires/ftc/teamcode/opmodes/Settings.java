package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.skeletonarmy.marrow.prompts.BooleanPrompt;
import com.skeletonarmy.marrow.settings.SettingsOpMode;

@TeleOp()
public class Settings extends SettingsOpMode {
    @Override
    public void defineSettings() {
        add("debug_mode", "Debug Mode", new BooleanPrompt("Enable debug mode?", false));
    }
}
