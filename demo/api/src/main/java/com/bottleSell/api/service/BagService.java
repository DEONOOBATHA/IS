package com.bottleSell.api.service;

import com.bottleSell.api.models.Bag;
import com.bottleSell.api.models.User;

import java.util.List;

public interface BagService {
    public List<Bag> getBagByUser(User user);
    public void createBag(Bag bag);

    public void deleteBagByUser(User user);

    public void updateTotalFromBag(Bag bag);
}
