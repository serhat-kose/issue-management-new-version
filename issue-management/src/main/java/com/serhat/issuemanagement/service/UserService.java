package com.serhat.issuemanagement.service;

import com.serhat.issuemanagement.dto.UserDto;
import com.serhat.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
