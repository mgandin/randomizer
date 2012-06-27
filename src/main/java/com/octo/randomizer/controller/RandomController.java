package com.octo.randomizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.octo.randomizer.domain.Randomizer;
import com.octo.randomizer.domain.Randoom;

@Controller
@RequestMapping("/randomizer")
public class RandomController {

	@RequestMapping(value = "{maxrange}/{number}", method = RequestMethod.GET)
	public @ResponseBody Randoom getRandomInJson(@PathVariable String maxrange, @PathVariable String number) {
		Integer numbered = new Integer(number);
		Integer maxranged = new Integer(maxrange);
		Randomizer randomizer = new Randomizer(numbered,maxranged);
		Randoom random = new Randoom(numbered,randomizer.work());
		return random;
	}

}
