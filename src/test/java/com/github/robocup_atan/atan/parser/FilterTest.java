package com.github.robocup_atan.atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.parser.Filter;
import com.github.robocup_atan.atan.parser.CommandFilter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Atan
 */
public class FilterTest {

    /**
     *
     */
    public FilterTest() {}

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     *
     */
    @Before
    public void setUp() {}

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of run method, of class Filter.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        String        cmd      = "(init l 1 before_kick_off)";
        CommandFilter f        = new CommandFilterImpl();
        Filter        instance = new Filter();
        instance.run(cmd, f);
        cmd = "(server_param (audio_cut_dist 50)(auto_mode 0)(back_dash_rate 0.6)(back_passes 1)(ball_accel_max 2.7)"
              + "(ball_decay 0.94)(ball_rand 0.05)(ball_size 0.085)(ball_speed_max 3)(ball_stuck_area 3)"
              + "(ball_weight 0.2)(catch_ban_cycle 5)(catch_probability 1)(catchable_area_l 1.2)(catchable_area_w 1)"
              + "(ckick_margin 1)(clang_advice_win 1)(clang_define_win 1)(clang_del_win 1)(clang_info_win 1)"
              + "(clang_mess_delay 50)(clang_mess_per_cycle 1)(clang_meta_win 1)(clang_rule_win 1)"
              + "(clang_win_size 300)(coach 0)(coach_port 6001)(coach_w_referee 0)(connect_wait 300)"
              + "(control_radius 2)(dash_angle_step 45)(dash_power_rate 0.006)(drop_ball_time 200)(effort_dec 0.005)"
              + "(effort_dec_thr 0.3)(effort_inc 0.01)(effort_inc_thr 0.6)(effort_init 1)(effort_min 0.6)"
              + "(extra_half_time 100)(extra_stamina 50)(forbid_kick_off_offside 1)(free_kick_faults 1)"
              + "(freeform_send_period 20)(freeform_wait_period 600)(fullstate_l 0)(fullstate_r 0)"
              + "(game_log_compression 0)(game_log_dated 1)(game_log_dir \"./\")(game_log_fixed 0)"
              + "(game_log_fixed_name \"rcssserver\")(game_log_version 5)(game_logging 1)(game_over_wait 100)"
              + "(goal_width 14.02)(goalie_max_moves 2)(half_time 300)(hear_decay 1)(hear_inc 1)(hear_max 1)"
              + "(inertia_moment 5)(keepaway 0)(keepaway_length 20)(keepaway_log_dated 1)(keepaway_log_dir \"./\")"
              + "(keepaway_log_fixed 0)(keepaway_log_fixed_name \"rcssserver\")(keepaway_logging 1)"
              + "(keepaway_start -1)(keepaway_width 20)(kick_off_wait 100)(kick_power_rate 0.027)(kick_rand 0.1)"
              + "(kick_rand_factor_l 1)(kick_rand_factor_r 1)(kickable_margin 0.7)"
              + "(landmark_file \"rcssserver-landmark.xml\")(log_date_format \"%Y%m%d%H%M-\")(log_times 0)"
              + "(max_back_tackle_power 0)(max_dash_angle 180)(max_dash_power 100)(max_goal_kicks 3)"
              + "(max_tackle_power 100)(maxmoment 180)(maxneckang 90)(maxneckmoment 180)(maxpower 100)"
              + "(min_dash_angle -180)(min_dash_power -100)(minmoment -180)(minneckang -90)(minneckmoment -180)"
              + "(minpower -100)(nr_extra_halfs 2)(nr_normal_halfs 2)(offside_active_area_size 2.5)"
              + "(offside_kick_margin 9.15)(olcoach_port 6002)(old_coach_hear 0)(pen_allow_mult_kicks 1)"
              + "(pen_before_setup_wait 10)(pen_coach_moves_players 1)(pen_dist_x 42.5)(pen_max_extra_kicks 5)"
              + "(pen_max_goalie_dist_x 14)(pen_nr_kicks 5)(pen_random_winner 0)(pen_ready_wait 10)"
              + "(pen_setup_wait 70)(pen_taken_wait 150)(penalty_shoot_outs 1)(player_accel_max 1)"
              + "(player_decay 0.4)(player_rand 0.1)(player_size 0.3)(player_speed_max 1.05)"
              + "(player_speed_max_min 0.75)(player_weight 60)(point_to_ban 5)(point_to_duration 20)(port 6000)"
              + "(prand_factor_l 1)(prand_factor_r 1)(profile 0)(proper_goal_kicks 0)(quantize_step 0.1)"
              + "(quantize_step_l 0.01)(record_messages 0)(recover_dec 0.002)(recover_dec_thr 0.3)(recover_init 1)"
              + "(recover_min 0.5)(recv_step 10)(say_coach_cnt_max 128)(say_coach_msg_size 128)(say_msg_size 10)"
              + "(send_comms 0)(send_step 150)(send_vi_step 100)(sense_body_step 100)(side_dash_rate 0.4)"
              + "(simulator_step 100)(slow_down_factor 1)(slowness_on_top_for_left_team 1)"
              + "(slowness_on_top_for_right_team 1)(stamina_capacity 130600)(stamina_inc_max 45)(stamina_max 8000)"
              + "(start_goal_l 0)(start_goal_r 0)(stopped_ball_vel 0.01)(synch_micro_sleep 1)(synch_mode 0)"
              + "(synch_offset 60)(synch_see_offset 0)(tackle_back_dist 0)(tackle_cycles 10)(tackle_dist 2)"
              + "(tackle_exponent 6)(tackle_power_rate 0.027)(tackle_width 1.25)(team_actuator_noise 0)"
              + "(team_l_start \"\")(team_r_start \"\")(text_log_compression 0)(text_log_dated 1)"
              + "(text_log_dir \"./\")(text_log_fixed 0)(text_log_fixed_name \"rcssserver\")(text_logging 1)"
              + "(use_offside 1)(verbose 0)(visible_angle 90)(visible_distance 3)(wind_ang 0)(wind_dir 0)"
              + "(wind_force 0)(wind_none 0)(wind_rand 0)(wind_random 0))";
        instance.run(cmd, f);
        cmd = "(player_param (allow_mult_default_type 0)(dash_power_rate_delta_max 0)(dash_power_rate_delta_min 0)"
              + "(effort_max_delta_factor -0.004)(effort_min_delta_factor -0.004)(extra_stamina_delta_max 50)"
              + "(extra_stamina_delta_min 0)(inertia_moment_delta_factor 25)(kick_rand_delta_factor 1)"
              + "(kickable_margin_delta_max 0.1)(kickable_margin_delta_min -0.1)"
              + "(new_dash_power_rate_delta_max 0.0008)(new_dash_power_rate_delta_min -0.0012)"
              + "(new_stamina_inc_max_delta_factor -6000)(player_decay_delta_max 0.1)(player_decay_delta_min -0.1)"
              + "(player_size_delta_factor -100)(player_speed_max_delta_max 0)(player_speed_max_delta_min 0)"
              + "(player_types 18)(pt_max 1)(random_seed 1268836071)(stamina_inc_max_delta_factor 0)(subs_max 3))";
        instance.run(cmd, f);
        cmd = "(player_type (id 4)(player_speed_max 1.05)(stamina_inc_max 51.7387)(player_decay 0.463424)"
              + "(inertia_moment 6.58559)(dash_power_rate 0.00487688)(player_size 0.3)(kickable_margin 0.713499)"
              + "(kick_rand 0.113499)(extra_stamina 62.4646)(effort_max 0.950141)(effort_min 0.550141))";
        instance.run(cmd, f);
        cmd = "(sense_body 0 (view_mode high normal) (stamina 8000 1 130600) (speed 0 0) (head_angle 0) (kick 0) "
              + "(dash 0) (turn 0) (say 0) (turn_neck 0) (catch 0) (move 0) (change_view 0) (arm (movable 0) "
              + "(expires 0) (target 0 0) (count 0)) (focus (target none) (count 0)) (tackle (expires 0) "
              + "(count 0)) (collision none))";
        instance.run(cmd, f);
        cmd = "(see 0 ((f c b) 30.3 8 0 0) ((f r t) 104.6 -38) ((f r b) 82.3 3) ((f g r b) 85.6 -16) ((g r) 87.4 -20)"
              + " ((f g r t) 90 -24) ((f p r b) 66.7 -8) ((f p r c) 72.2 -24) ((f p r t) 83.1 -37)"
              + " ((f t r 40) 98.5 -45) ((f t r 50) 105.6 -41) ((f b 0) 31.2 17) ((f b r 10) 40.9 13)"
              + " ((f b r 20) 50.9 10) ((f b r 30) 60.9 9) ((f b r 40) 70.8 7) ((f b r 50) 80.6 6)"
              + " ((f b l 10) 22 24 0 0) ((f b l 20) 13.5 42 0 0) ((f r 0) 92.8 -19) ((f r t 10) 96.5 -25) "
              + "((f r t 20) 100.5 -30) ((f r t 30) 105.6 -34) ((f r b 10) 90 -13) ((f r b 20) 88.2 -7) "
              + "((f r b 30) 87.4 0) ((l r) 82.3 90))";
        instance.run(cmd, f);
    }

    /**
     *
     * @author Atan
     */
    public static class CommandFilterImpl implements CommandFilter {

        /**
         *
         * @param cmd
         */
        @Override
        public void seeCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void hearCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void senseBodyCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void initCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void errorCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void serverParamCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void playerParamCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void playerTypeCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void changePlayerTypeCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void okCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void warningCommand(String cmd) {}
    }
}
