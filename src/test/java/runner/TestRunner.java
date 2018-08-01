package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import steps.CommentStepTest;

@RunWith(Suite.class) 
@SuiteClasses({
	CommentStepTest.class
})

public class TestRunner {

}
