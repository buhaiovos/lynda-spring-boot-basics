package com.osb.roomwebapp;

import com.frankmoley.landon.aop.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private RoomServices roomServices;

    @Autowired
    public ApiController(RoomServices roomServices) {
        this.roomServices = roomServices;
    }

    @GetMapping("/rooms")
    @Timed
    public List<Room> getAllRooms() {
        return this.roomServices.getAllRooms();
    }
}
