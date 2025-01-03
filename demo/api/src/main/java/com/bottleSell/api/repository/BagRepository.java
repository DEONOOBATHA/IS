package com.bottleSell.api.repository;

import com.bottleSell.api.models.Bag;
import com.bottleSell.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BagRepository extends JpaRepository<Bag,Integer> {
    public List<Bag> getBagByUserBag(User user);
    public void deleteBagByUserBag(User user);

}
