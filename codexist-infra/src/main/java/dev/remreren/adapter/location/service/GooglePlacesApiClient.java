package dev.remreren.adapter.location.service;

import dev.remreren.adapter.location.model.GooglePlacesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "places-client", url = "https://maps.googleapis.com/maps/api/place/textsearch/json")
public interface GooglePlacesApiClient {

    @GetMapping
    GooglePlacesResponse getPlacesNearLocation(@RequestParam("location") String location,
                                               @RequestParam("query") String query,
                                               @RequestParam("key") String key,
                                               @RequestParam("radius") Long radius);

}
