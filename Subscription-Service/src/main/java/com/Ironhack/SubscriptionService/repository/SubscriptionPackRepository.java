package com.Ironhack.SubscriptionService.repository;

import com.Ironhack.SubscriptionService.dao.SubscriptionPack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionPackRepository extends JpaRepository<SubscriptionPack, Long> {
}
