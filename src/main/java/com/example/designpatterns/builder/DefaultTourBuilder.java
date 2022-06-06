package com.example.designpatterns.builder;

import java.time.LocalDate;

public class DefaultTourBuilder implements TourPlanBuilder{

    private TourPlan tourPlan;

    public TourPlanBuilder newInstance(){
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        tourPlan.setNights(nights);
        tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String wheretoStay) {
        tourPlan.setWhereToStay(wheretoStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        tourPlan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
