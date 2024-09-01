package com.vueProject.bloomcityserver.controller;

import com.vueProject.bloomcityserver.dto.NavDTO;
import com.vueProject.bloomcityserver.dto.MenuItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:8080")
public class BloomCityController {

    List<MenuItemDTO> createMenuItemList(MenuItemDTO... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @GetMapping("/ui/nav")
    public List<NavDTO> nav(){
        List<NavDTO> nav = new ArrayList<>();
        String subjectPath;

        subjectPath = "/accommodations";
        nav.add(new NavDTO("accommodations",subjectPath,
                createMenuItemList(
                new MenuItemDTO("일반객실", subjectPath+ "/deluxe"),
                new MenuItemDTO("스위트", subjectPath+ "/suite"),
                new MenuItemDTO("풀빌라", subjectPath+ "/poolvilla"),
                new MenuItemDTO("라운지", subjectPath+ "/lounge")
        )));

        subjectPath = "/dinning";
        nav.add(new NavDTO("dinning", subjectPath,
                createMenuItemList(
                new MenuItemDTO("파인다이닝", subjectPath+ "/"),
                new MenuItemDTO("카페&바", subjectPath+ "/")
        )));

        subjectPath = "/funjoy";
        nav.add(new NavDTO("fun&joy", subjectPath,
                createMenuItemList(
                new MenuItemDTO("레저시설", subjectPath+ "/"),
                new MenuItemDTO("부대시설", subjectPath+ "/")
        )));

        subjectPath = "/meetingwedding";
        nav.add(new NavDTO("meeting&wedding", subjectPath,
                createMenuItemList(
                new MenuItemDTO("컨벤션", subjectPath+ "/"),
                new MenuItemDTO("웨딩", subjectPath+ "/")
        )));
        subjectPath = "/paradise";
        nav.add(new NavDTO("paradise city", subjectPath,
                createMenuItemList(
                new MenuItemDTO("파라다이스 시티", subjectPath+ "/"),
                new MenuItemDTO("오시는 길", subjectPath+ "/")
        )));

        log.info("nav 데이터 전송");
        return nav;
    }
}