package com.marjane.marjanepromotion.ApplicablePromotions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicablePromotionsRepository extends JpaRepository<ApplicablePromotions, Long> {
}
