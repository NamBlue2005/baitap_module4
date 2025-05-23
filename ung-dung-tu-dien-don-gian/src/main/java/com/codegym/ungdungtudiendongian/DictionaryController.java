package com.codegym.ungdungtudiendongian;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("java", "ngôn ngữ lập trình Java");
        dictionary.put("spring", "khung ứng dụng Spring");
        dictionary.put("computer", "máy tính");
        dictionary.put("keyboard", "bàn phím");
        dictionary.put("mouse", "chuột");
    }

    @GetMapping("/")
    public String showSearchForm() {
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("keyword") String keyword, Model model) {
        String result = dictionary.get(keyword.toLowerCase());

        if (result != null) {
            model.addAttribute("keyword", keyword);
            model.addAttribute("meaning", result);
            return "result";
        } else {
            model.addAttribute("message", "Không tìm thấy từ '" + keyword + "' trong từ điển.");
            return "index";
        }
    }
}
