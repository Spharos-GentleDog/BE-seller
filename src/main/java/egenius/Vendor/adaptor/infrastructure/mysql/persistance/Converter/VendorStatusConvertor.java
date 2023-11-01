package egenius.Vendor.adaptor.infrastructure.mysql.persistance.Converter;

import egenius.Vendor.domain.enums.VendorStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.stereotype.Component;

@Converter
@Component
public class VendorStatusConvertor implements AttributeConverter<VendorStatus, Integer> {

    // enum -> DB
    @Override
    public Integer convertToDatabaseColumn(VendorStatus attribute) {
        return attribute.getCodeValue();
    }

    //DB -> enum
    @Override
    public VendorStatus convertToEntityAttribute(Integer dbData) {
        return VendorStatus.ofCodeValue(dbData);
    }


}