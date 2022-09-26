package com.vamshi.signin;

public class ErrorMsgDisplay {

	public String msg;
	Demo1WBuilder demo = new Demo1WBuilder();
	public ErrorMsgDisplay(String msg) throws InterruptedException
	{
		this.msg = msg;
		demo.displayErrorMsg(msg);
		Thread.sleep(4000);
		demo.startApplication();
	}
}
