package com.codegym.springtimezonegradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/")
    public String getTimeByTimezone(ModelMap model, @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {
        try {
            Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
            if (!availableZoneIds.contains(city)) {
                model.addAttribute("error", "Invalid timezone: " + city);
                model.addAttribute("city", city);
                return "index";
            }

            ZoneId zoneId = ZoneId.of(city);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
            String formattedTime = zonedDateTime.format(formatter);

            model.addAttribute("city", city);
            model.addAttribute("date", formattedTime);
            return "index";
        } catch (Exception e) {
            model.addAttribute("error", "Error retrieving time for timezone: " + city);
            model.addAttribute("city", city);
            return "index";
        }

    }
}