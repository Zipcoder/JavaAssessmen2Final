package com.zipcodewilmington.assessment2;

import com.zipcodewilmington.assessment2.part1.WuTangConcatenatorTest;
import com.zipcodewilmington.assessment2.part2.ArrayUtilityTestSuite;
import com.zipcodewilmington.assessment2.part3.RockPaperScissorTestSuite;
import com.zipcodewilmington.assessment2.part4.GeometryTest;
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
        GeometryTest.class
})
public class ProjectTestSuite {
}
