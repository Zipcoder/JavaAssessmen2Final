package com.zipcodewilmington.assessment2;

import com.zipcodewilmington.assessment2.part1.WuTangConcatenatorTest;
import com.zipcodewilmington.assessment2.part2.ArrayUtilityTestSuite;
import com.zipcodewilmington.assessment2.part3.RockPaperScissorTestSuite;
import com.zipcodewilmington.assessment2.part4.GeometryTest;
import com.zipcodewilmington.assessment2.part5.ElectionLandTest;
import com.zipcodewilmington.assessment2.part6.LoveLetterTest;
import com.zipcodewilmington.assessment2.part7.FindTheWinnerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to test all methods in this project
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({

        ArrayUtilityTestSuite.class,
        WuTangConcatenatorTest.class,
        RockPaperScissorTestSuite.class,
        GeometryTest.class,
        ElectionLandTest.class,
        LoveLetterTest.class,
        FindTheWinnerTest.class })

public class ProjectTestSuite {
}
