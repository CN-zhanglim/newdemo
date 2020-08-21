package com.zlm.providerdemo.service;

import com.zlm.providerdemo.api.ProviderService;

/**
 * @title: FirstProviderServiceImpl
 * @Date: 2020/8/21 19:08
 */
public class FirstProviderServiceImpl implements ProviderService {
    @Override
    public String getProviderName() {
        return "FirstProviderService";
    }
}
