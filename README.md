# Java Assessment 2 - Submission Branch
* You _may_ need to first perform
```bash
git remote add zipcoder https://github.com/Zipcoder/JavaAssessmen2Final
git fetch zipcoder submission
git checkout submission
```


* This is the branch you will submit your project into! 

* Follow these steps to submit. 
	* Merge part 1 into this branch
	* Merge part 2 into this branch
	* Merge part 3 into this branch
	* Merge part 4 into this branch
	* Merge part 5 into this branch
	* Merge part 6 into this branch
	* Merge part 7 into this branch

* Each time you merge you may have a conflict with `ProjectTestSuite` file since you may have modified that file to run the tests.
* If this is the case, you can resolve these conflicts by editting the file to look like this

	```java
	package com.zipcodewilmington.assessment2;
	
	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;
	
	/**
	 * Created by leon on 3/1/18.
	 * The purpose of this class is to test all methods in this project
	 */
	@RunWith(Suite.class)
	
	@Suite.SuiteClasses({
	})
	public class ProjectTestSuite {
	}
	```

* Each time you get this merge conflict, simply copy and paste the contents above into the `ProjectTestSuite` file
* Once you have done that, `git add` your changes, `git commit -m 'resolved merge conflicts'` your changes and `git push` your submission branch to your repository
* From there, make a pull request from your `repository/submission` branch to `Zipcoder/submission`
* The travis build should start up and your tests will run. 

#### Note: 
While part 2 was not required, it will still run. If you were able to get any of that part running, it will benefit you but any failed tests will not affect your overall grade. as a result you may see a red x even though you may still get a perfect score.
=======
# Java Assessment 2 

This test is broken up into 7 sections. Each section is seperated into its individual branch.


| Branch Name | Branch Topic |
| ----------- | ------------ |
| **master**      |            |
| **part1**       |   WuTangConcatenator           |
| **part2**       |   ArrayUtility           |
| **part3**       |   Rock Paper Scissors Enum Evaluation           |
| **part4**       |   Java Interfaces           |
| **part5**       |   Election Problem           |
| **part6**       |   The Love-Letter Mystery            |
| **part7**       |   Find the Winner!           |


To begin working on a branch you must check the branch out.
For example to start **part1** 

```
git checkout part1

```

Once you switch to the branch you will see the README.md file in the source folder, and unit test in the test folder.

**PLEASE DO NOT FORGET TO READ THE README**

* Once you are finished a branch you must MERGE the branch into master!
* To merge into master you must commit and checkin your changes, then switch to master

```
// If you are currently working on branch 'part1' this is how you would merge
// to master
git add .
git commit -m "Finished working on part1"
git checkout master
git merge part1
```

* Any branch that has NOT been merged to master, will **NOT BE GRADED PERIOD!**

* **Frequently Asked Questions**
   * May I use my notes & the interwebz?
      * Yes, please.
  * Do I have to complete the test to pass?
      * No, work on the test IN ORDER, and complete as much as you can before 4pm
  * Am I allowed to take a break?
     * Yes, take as many breaks as you like. However do not talk about the test.	  	
=======
* While part 2 was not required, it will still run.
* If you were able to get any of that part running, it will benefit you but any failed tests will not affect your overall grade.
* As a result you may see a red x even though you may still get a perfect score.
