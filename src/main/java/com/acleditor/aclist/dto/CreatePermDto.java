package com.acleditor.aclist.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreatePermDto {
   private String id;
   private String code;
   private List<String> permissions;

}
