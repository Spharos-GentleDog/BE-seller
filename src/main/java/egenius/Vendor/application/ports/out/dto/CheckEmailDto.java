package egenius.Vendor.application.ports.out.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CheckEmailDto {

    // out model
    // persisitence Adaptor의 일부분으로 출력 결과 값을 반환 받는다
    // 반환 값을 전달하는 DTO

    private boolean vendorEmail;

    public static CheckEmailDto formCheckEmail(boolean vendorEmail){
        return CheckEmailDto.builder()
                .vendorEmail(vendorEmail)
                .build();
    }
}