package com.s28572.tpo06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FakeDataController {

    private final FakeDataService fakeDataService;

    public FakeDataController(FakeDataService fakeDataService) {
        this.fakeDataService = fakeDataService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("personFormDTO", new PersonFormDTO());
        return "index";
    }

    @PostMapping("/generate")
    public String generateFakeData(@ModelAttribute PersonFormDTO personFormDTO, Model model) {
        List<Person> generatedData = fakeDataService.generateFakeData(personFormDTO);
        model.addAttribute("exampleData", generatedData.getFirst());
        model.addAttribute("fakeData", generatedData);
        return "index";
    }
}
