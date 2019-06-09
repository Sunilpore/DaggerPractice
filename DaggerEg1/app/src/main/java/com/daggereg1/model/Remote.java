package com.daggereg1.model;

import com.daggereg1.utils.LogHelper;

import javax.inject.Inject;


class Remote {

     @Inject
     public Remote() {
     }

     public void setListener(Car car){
         LogHelper.showLogData("Remote connected...");
     }

 }
