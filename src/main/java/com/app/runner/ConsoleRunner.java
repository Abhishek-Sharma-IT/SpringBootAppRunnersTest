package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class ConsoleRunner implements ApplicationRunner{

	public void run(ApplicationArguments args) throws Exception {
		
		// ----- Option Argument -----
		// -----1. Read All Argument -----
		Set<String> opkey=args.getOptionNames();
		System.out.println(opkey);
		
		// -----2.One Key Related Value -----
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);
		
		// -----3.Check for key exist -----
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		// -----NonOption-----
		List<String> nonop=args.getNonOptionArgs();
		System.out.println(nonop);
		
		// -----All Arguments-----
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
		
	}

}
