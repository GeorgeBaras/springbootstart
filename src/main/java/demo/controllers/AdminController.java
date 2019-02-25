package demo.controllers;

import demo.domain.DemoObject;
import demo.persistence.DemoObjectRepository;
import demo.services.DemoObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private DemoObjectService demoObjectService;

    @RequestMapping("/admin/all")
    public ModelAndView admin(Model model){
        DemoObject demo = new DemoObject();
        demo.setDemoProperty("demo");
        demo.setId(1);
        List<DemoObject> demos = new ArrayList<>();
        demos.add(demo);
        demos.add(demo);
        //model.addAttribute("objects", this.demoObjectService.findAll());
        model.addAttribute("objects", demos);

        return new ModelAndView("admin");
    }

    @PutMapping(value = "/admin/update" + "/{demoObjectId}")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView updateObject(Model model, @PathVariable String demoObjectId) {
//        DemoObject demoObject = this.demoObjectService.findDemoObjectById(demoObjectId);
//        demoObject.setDemoProperty(demoObject.getDemoProperty()+"*");
//        this.demoObjectService.save(demoObject);
        DemoObject demo = new DemoObject();
        demo.setDemoProperty("demoUpdated");
        demo.setId(1);
        List<DemoObject> demos = new ArrayList<>();
        demos.add(demo);
        model.addAttribute("objects", demos);
        return new ModelAndView("admin");
    }

    @PostMapping(value = "/admin/delete" + "/{demoObjectId}")
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView deleteObject(Model model, @PathVariable String demoObjectId) {
//        DemoObject demoObject = this.demoObjectService.findDemoObjectById(demoObjectId);
//        this.demoObjectService.delete(demoObject);
        DemoObject demo = new DemoObject();
        demo.setDemoProperty("demo");
        demo.setId(1);
        List<DemoObject> demos = new ArrayList<>();
        demos.add(demo);
        model.addAttribute("objects", demos);
        return new ModelAndView("admin");
    }


}
