package com.acleditor.aclist.controller;

import com.acleditor.aclist.dto.CreatePermDto;
import com.acleditor.aclist.dto.ResponseDto;
import com.acleditor.aclist.enums.ResponseStatusEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/do")
public class ActionController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> doCreate(@RequestBody CreatePermDto createPermDto){
        ResponseDto responseDto = new ResponseDto();
        responseDto.setPayload(List.of("ok"));
        responseDto.setStatus(ResponseStatusEnum.SUCCESS);
        System.out.println(createPermDto.toString());
        return new ResponseEntity<>(responseDto, HttpStatus.OK);

    }


}
