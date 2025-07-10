package com.example.cadieuhong.mapper;

import com.example.cadieuhong.enity.User;
import com.example.cadieuhong.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
}
