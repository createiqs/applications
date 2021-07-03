package com.createiq.calTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.createiq.daotest.ProductDAOTest;
@RunWith(Suite.class)
@SuiteClasses(value = { CalTest.class,ProductDAOTest.class })
public class TestSuiteClass {

}
