package com.geektrust.backend.services;

import com.geektrust.backend.dto.MetroSummaryDTO;

import java.util.List;

public interface IMetroService {

     void checkInService(String cardId, String passengerType,String fromStation);
    List<MetroSummaryDTO> printSummary();
}
