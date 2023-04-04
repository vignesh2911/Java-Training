package com.pirai.example.commandline;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class OptionAndNonOptionArgs {
	@Autowired
	ApplicationArguments arguments;
	
	public void showArgs()
	{
		System.out.println("Non-Option Arguments");
		System.out.println("____________________");
		List<String> nonOptArgs = arguments.getNonOptionArgs();
		nonOptArgs.forEach(string -> System.out.println(string));
		System.out.println("Non-Option Arguments");
		System.out.println("____________________");
		Set<String> optionArgs = arguments.getOptionNames();
		optionArgs.forEach(string -> {
			System.err.println(string+"->");
			arguments.getOptionValues(string).forEach(v->System.out.println(v));
		});
	}
	
}
