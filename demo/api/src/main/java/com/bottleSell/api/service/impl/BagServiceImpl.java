package com.bottleSell.api.service.impl;

import com.bottleSell.api.models.Bag;
import com.bottleSell.api.models.User;
import com.bottleSell.api.repository.BagRepository;
import com.bottleSell.api.service.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BagServiceImpl implements BagService {
    private BagRepository repository;

    @Autowired //Dependency injection
    public BagServiceImpl(BagRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Bag> getBagByUser(User user) {

        return repository.getBagByUserBag(user);
    }

    @Override
    public void createBag(Bag bag) {
        repository.save(bag);
    }

    @Override
    public void deleteBagByUser(User user) {
        repository.deleteBagByUserBag(user);
    }

    @Override
    public void updateTotalFromBag(Bag bag) {
        bag.setTotal(bag.getTotal()+1)
        ;
    }



}
