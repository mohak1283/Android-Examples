package com.example.espressoexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void checkingLoginFailure() {

        onView(withId(R.id.edt_email)).perform(typeText("mohak123@gmail.com"), closeSoftKeyboard());

        onView(withId(R.id.edt_pass)).perform(typeText("mohak12345"), closeSoftKeyboard());

        onView(withId(R.id.btn_login)).perform(click());

        onView(withId(R.id.tv_result)).check(matches(withText("LOGIN FAILED")));

    }


//    @Test
//    public void checkingLoginSuccess() {
//
//        onView(withId(R.id.edt_email)).perform(typeText("mohak123@gmail.com"), closeSoftKeyboard());
//
//        onView(withId(R.id.edt_pass)).perform(typeText("mohak1234"), closeSoftKeyboard());
//
//        onView(withId(R.id.btn_login)).perform(click());
//
//        onView(withId(R.id.tv_result)).check(matches(withText("LOGIN SUCCESS!")));
//
//    }



}
