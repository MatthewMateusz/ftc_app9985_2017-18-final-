package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Matthew on 9/27/2017.
 */
@Disabled
@TeleOp (name = "TEMPLATE_Teleop")
public class FTC201718_Telop extends OpMode
{
    private FTC201718_Actuators_Setup actuators = new FTC201718_Actuators_Setup();
    private FTC201718_Sensors_Setups  sensors   = new FTC201718_Sensors_Setups();


    //Code thar runs ONCE when the driver hits INIT
    @Override
    public void init()
    {
        telemetry.addData("Status" , "Starting Init of Telop");
        telemetry.update();

        actuators.init(hardwareMap);
        sensors.init(hardwareMap);

        telemetry.addData("Status" , "Finished Init of Telop");
        telemetry.addData("Status" , "Waiting for start");
    }

    // Code to run REAPEATEDLY after the driver hits INIT, but before they hit PLAY
    @Override
    public void init_loop()
    {

    }

    //Code to run ONCE when the driver hits PLAY
    @Override
    public void start ()
    {
        telemetry.addData("Say" , "I bet you will win");
        telemetry.update();
    }

    //Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
    @Override
    public void loop()
    {
        //Varibles that get input from controller uncomment when needed
        //To invert controls put - sign after = sign in double statement

        //Gamepad 1
        double GP1_LeftStickY  = gamepad1.left_stick_y; //Linear slide in and out
        //double GP1_LeftStickX  = gamepad1.left_stick_x;
        double GP1_RightStickY = gamepad1.right_stick_y; //Robot forward/backwrad
        double GP1_RIghtStickX = gamepad1.right_stick_x; // Robot left/right

        boolean GP1_LeftStickButton  = gamepad1.left_stick_button; //Toggle grab
        //boolean GP1_RightStickButton = gamepad1.right_stick_button;

        double GP1_LeftTrigger    = gamepad1.left_trigger; //Rotate Left
        double GP1_RightTrigger   = gamepad1.right_trigger; //Rotate right
        boolean GP1_LeftBumper  = gamepad1.left_bumper; //Slow drive mode
        //boolean GP1_RightBumper = gamepad1.right_bumper;

        //boolean GP1_ButtonY = gamepad1.y;
        //boolean GP1_ButtonX = gamepad1.x;
        //boolean GP1_ButtonA = gamepad1.a;
        //boolean GP1_ButtonB = gamepad1.b;

        //boolean GP1_DPadUp    = gamepad1.dpad_up;
        //boolean GP1_DPadLeft  = gamepad1.dpad_left;
        //boolean GP1_DPadRight = gamepad1.dpad_right;
        //boolean GP1_DPadDown  = gamepad1.dpad_down


        //Gamepad 2
        //double GP2_LeftStickY  = gamepad2.left_stick_y;
        //double GP2_LeftSitckX  = gamepad2.left_stick_x;
        double GP2_RightStickY = gamepad2.right_stick_y; //Front arm
        //double GP2_RightStickX = gamepad2.right_stick_x;

        //boolean GP2_LeftStickButton  = gamepad2.left_stick_button;
        //boolean GP2_RightStickButton = gamepad2.right_stick_button;
        //boolean GP2_LeftBumper       = gamepad1.left_bumper;
        //boolean GP2_RightBumper      = gamepad1.right_bumper;

        //double GP2_LeftTrigger  = gamepad2.left_trigger;
        //double GP2_RightTrigger = gamepad2.right_trigger;

        boolean GP2_ButtonY = gamepad2.y; //Tail up
        boolean GP2_ButtonX = gamepad2.x; //Close Jaw
        boolean GP2_ButtonA = gamepad2.a; //Open Jaw
        boolean GP2_ButtonB = gamepad2.b; //Tail down

        //boolean GP2_DPadUP    = gamepad2.dpad_up;
        boolean GP2_DPadLeft  = gamepad2.dpad_left;  //Idle grabber close
        boolean GP2_DPadRight = gamepad2.dpad_right; //Idle grabber open
        //boolean GP2_DPadDown  = gamepad2.dpad_down;

        //Custom vars
        boolean StickPressed;

        //Define vars

    }

    //Code that runs when STOP is hit
    @Override
    public void stop()
    {
        telemetry.addData("Status" , "Telop has stopped");
        telemetry.update();
    }

    public void RotateLeft (double power)
    {
        actuators.FrontLeft.setPower(-power);
        actuators.FrontRight.setPower(power);
        actuators.RearLeft.setPower(-power);
        actuators.RearRight.setPower(power);
    }

    public void RoateRight (double power)
    {
        actuators.FrontLeft.setPower(power);
        actuators.FrontRight.setPower(-power);
        actuators.RearLeft.setPower(power);
        actuators.RearRight.setPower(-power);
    }

    public void MoveForward (double power)
    {
        actuators.FrontLeft.setPower(power);
        actuators.FrontRight.setPower(power);
        actuators.RearLeft.setPower(power);
        actuators.RearRight.setPower(power);
    }

    public void MoveBackward (double power)
    {
        actuators.FrontLeft.setPower(-power);
        actuators.FrontRight.setPower(-power);
        actuators.RearLeft.setPower(-power);
        actuators.RearRight.setPower(-power);
    }

    //Check this one
    public void MoveLeft (double power)
    {
        actuators.FrontLeft.setPower(-power);
        actuators.FrontRight.setPower(power);
        actuators.RearLeft.setPower(power);
        actuators.RearRight.setPower(-power);
    }

    //Check this one
    public void MoveRight (double power)
    {
        actuators.FrontLeft.setPower(power);
        actuators.FrontRight.setPower(-power);
        actuators.RearLeft.setPower(-power);
        actuators.RearRight.setPower(power);
    }
}
