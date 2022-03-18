package kr.co.guide.travel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.guide.travel.domain.AreaDTO;
import kr.co.guide.travel.domain.ScheduleDTO;
import kr.co.guide.travel.domain.ScheduleDetailDTO;
import kr.co.guide.travel.service.AreaService;
import kr.co.guide.travel.service.ScheduleService;

@Controller
@RequestMapping("/travel")
public class ScheduleController {
   private static final Logger logger = LoggerFactory.getLogger(ScheduleController.class);
   
   @Autowired
   private AreaService service;
   
   @Autowired
   private ScheduleService sService;
   
   @GetMapping("/schedule")
   public void scheduling(AreaDTO aDto, Model model) throws Exception {
      logger.info("schedule get...........");
      model.addAttribute("tour", service.tourList(aDto));
   }
   
   @PostMapping("/scheduleInsert")
   public String insert(ScheduleDTO sDto, ScheduleDetailDTO sdDto, String ssss) throws Exception {
	   logger.info("scheduleInsert post...........");
	   System.out.println(sDto);
	   System.out.println(sdDto);
	   System.out.println(ssss);
	   System.out.println(sDto.getSchedule_start().getClass().getName());
   //sService.sInsert(sDto);
//	   sService.sdInsert(sdDto);
	   
	   return "redirect:/";
   }
}