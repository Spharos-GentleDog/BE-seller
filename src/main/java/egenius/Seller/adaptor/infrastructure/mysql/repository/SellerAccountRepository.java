package egenius.Seller.adaptor.infrastructure.mysql.repository;

import egenius.Seller.adaptor.infrastructure.mysql.entity.SellerAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerAccountRepository extends JpaRepository<SellerAccountEntity, Integer> {

    //회원가입시 계좌생성 및 저장
    SellerAccountEntity save(SellerAccountEntity sellerAccountEntity);
}