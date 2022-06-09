package com.example.designpatterns.creational_patterns.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String wheretoStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
