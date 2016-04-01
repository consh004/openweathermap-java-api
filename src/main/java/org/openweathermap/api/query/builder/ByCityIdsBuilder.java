package org.openweathermap.api.query.builder;

import org.openweathermap.api.query.ByCityIds;

import java.util.Collection;

public class ByCityIdsBuilder extends CurrentWeatherManyLocationsQueryBuilder<ByCityIdsBuilder, ByCityIds> {
    private ByCityIds query;

    public ByCityIdsBuilder(Collection<String> cityIds) {
        query = new ByCityIds(cityIds);
    }

    public ByCityIdsBuilder() {
        query = new ByCityIds();
    }

    public ByCityIdsBuilder addCityId(String cityId) {
        query.addCityId(cityId);
        return self();
    }

    @Override
    protected ByCityIdsBuilder self() {
        return this;
    }

    @Override
    protected ByCityIds getQuery() {
        return query;
    }
}
