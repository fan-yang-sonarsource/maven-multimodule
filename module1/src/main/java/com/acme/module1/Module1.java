package com.acme.module1;

public class Module1 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test, yes!");
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test, woohoo!");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }

}
