package kr.co.antoon.user.application;

import kr.co.antoon.error.dto.ErrorMessage;
import kr.co.antoon.error.exception.common.NotExistsException;
import kr.co.antoon.user.domain.User;
import kr.co.antoon.user.dto.request.UserDetailRequest;
import kr.co.antoon.user.dto.response.UserDetailResponse;
import kr.co.antoon.user.infrastructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public User findOneById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NotExistsException(ErrorMessage.NOT_EXIST_USER));
    }

    @Transactional(readOnly = true)
    public UserDetailResponse findById(Long id) {
        var user = findOneById(id);

        return new UserDetailResponse(user);
    }

    @Transactional(readOnly = true)
    public long count() {
        return userRepository.count();
    }

    @Transactional
    public UserDetailResponse updateById(Long id, UserDetailRequest request) {
        var user = findOneById(id).update(request.name(), request.imageUrl());
        return new UserDetailResponse(user);
    }

    @Transactional
    public UserDetailResponse updateImgaeUrlById(Long id, String image) {
        var user = findOneById(id).updateImageUrl(image);
        return new UserDetailResponse(user);
    }

    @Transactional
    public UserDetailResponse updateNameById(Long id, String name) {
        var user = findOneById(id).updateName(name);
        return new UserDetailResponse(user);
    }
}