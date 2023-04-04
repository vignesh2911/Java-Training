package com.pirai.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pirai.example.commandline.OptionAndNonOptionArgs;
@Component
public class HelloRunner implements CommandLineRunner {
	@Autowired
	OptionAndNonOptionArgs optNonArgs;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		optNonArgs.showArgs();
	}

}
