package com.example.designpatterns.creational_patterns.builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip(){
        return tourPlanBuilder.title("칸쿤 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2020,12,9))
                .whereToStay("리조트")
                .addPlan(0, "체크인 짐 풀기")
                .addPlan(0, "밥")
                .getPlan();
    }

    public TourPlan longbeachTrip(){
        return tourPlanBuilder.title("롱비치")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2020,7,15))
                .whereToStay("리조트")
                .addPlan(0, "체크인 짐 풀기")
                .addPlan(0, "밥")
                .getPlan();
    }
}
