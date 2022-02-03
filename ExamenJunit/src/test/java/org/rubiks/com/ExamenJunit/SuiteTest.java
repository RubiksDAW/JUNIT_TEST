package org.rubiks.com.ExamenJunit;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectPackages({"org.rubiks.com.ExamenJunit"})
@SelectClasses(TestJunit.class)
@IncludeTags("production")
@Suite
public class SuiteTest {

}